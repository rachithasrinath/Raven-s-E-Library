/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ravens.controller;

import com.ravens.model.Document;
import com.ravens.model.Loan;
import com.ravens.model.Patron;
import com.ravens.model.Subscription;
import com.ravens.model.impl.LoanImpl;
import com.ravens.model.impl.PatronImpl;
import com.ravens.model.impl.Search_CatalogueImpl;
import com.ravens.model.impl.SubscriptionImpl;
import com.ravens.model.loanBean;
import com.ravens.model.subBeanClass;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pratibhakakarla
 */
@Controller
@RequestMapping("/Patron")
public class PatronController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView patronLogin(ModelAndView model) throws IOException {

        model.setViewName("PatronLogin");
        model.addObject("aaa", null);
        return model;
    }

    @RequestMapping(value = "/patronLogin", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView patronLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            ModelAndView model, HttpServletRequest request) throws IOException {

        System.out.println("password" + password);
        System.out.println("username" + username);
        PatronImpl patronImpl = new PatronImpl();
        Patron resp = patronImpl.getAuthentication(username, password, "Patron");
        System.out.println("resp" + resp.getPatronDetails().getName());
        if (resp != null) {

            request.getSession().setAttribute("id", resp.getPatronId());
            System.out.println(" the id" + resp.getPatronId());
            model.setViewName("PatronProfile");
            model.addObject("name", resp.getPatronDetails().getName());
            model.addObject("id", resp.getPatronId());
            return model;

        }

        model.setViewName("error");
        model.addObject("error", null);
        return model;
    }

    @RequestMapping(value = "/showSubOpt", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView showSubOpt(ModelAndView model, HttpServletRequest request) throws IOException {

        String ly = request.getSession().getAttribute("VAR").toString();
        System.out.println("the ly part" + ly);

        Subscription subsub = new SubscriptionImpl();
        subBeanClass ssss = subsub.getSubscriptionName(Integer.valueOf(ly));

        model.setViewName("SubscriptionPage");
        model.addObject("subscriptions", ssss);

        return model;
    }

    @RequestMapping(value = "/patronSubscribe", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView patronSubscribe(@RequestParam(value = "science", required = false, defaultValue = "") String science,
            @RequestParam(value = "engineering", required = false, defaultValue = "") String engineering,
            @RequestParam(value = "fiction", required = false, defaultValue = "") String fiction,
            @RequestParam(value = "religion", required = false, defaultValue = "") String religion,
            @RequestParam(value = "travel", required = false, defaultValue = "") String travel,
            ModelAndView model, HttpServletRequest request) throws IOException {

        String ly = request.getSession().getAttribute("VAR").toString();
        System.out.println("the ly in subscribe is" + ly);
        subBeanClass ssss = new subBeanClass();
        ssss.setEngineering(engineering);
        ssss.setFiction(fiction);
        ssss.setReligion(religion);
        ssss.setScience(science);
        ssss.setTravel(travel);
        ssss.setPatID(Integer.valueOf(ly));

        Patron pat = new PatronImpl();
        pat.subscribe(ssss);
        Integer intObj = new Integer(Integer.valueOf(ly));
        
        request.setAttribute("id",intObj);

        model.setViewName("PatronProfile");
        model.addObject("subadded", "the subscriptions are added successfully!!!");
        return model;
    }

    @RequestMapping(value = "/patronLoanDoc", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView patronLoanDoc(HttpServletRequest request, ModelAndView model, @RequestParam("docName") String docName) throws IOException {

        String ly = request.getSession().getAttribute("VAR").toString();
        System.out.println("the ly in subscribe is" + ly);
        loanBean loan = new loanBean();

        loan.setPatID(Integer.valueOf(ly));
        loan.setDocumentName(docName);
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 30);
        Date d = c.getTime();

        System.out.println("30 days after today is: " + d);

        loan.setIssuedate(new java.sql.Date(new Date().getTime()));
        loan.setReturndate(d);

        Loan abc = new LoanImpl();
        List<loanBean> retLoan = abc.borrowDocument(loan);

        model.setViewName("SuccessLoan");
        model.addObject("retLoan", retLoan);
        return model;

    }
    
    
     @RequestMapping(value = "/docList", method = RequestMethod.POST)
      public @ResponseBody
    ModelAndView displayCatalogue(
            ModelAndView model) throws IOException {

        Search_CatalogueImpl aaa = new Search_CatalogueImpl();
        List<Document> listofdoc = aaa.getDocument();

        model.addObject("listofdoc", listofdoc);
        model.setViewName("documentList");

        return model;
    }
    

}
