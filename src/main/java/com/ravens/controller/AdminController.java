/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ravens.controller;

import com.ravens.model.Authentication;
import com.ravens.model.Document;
import com.ravens.model.Search_Catalogue;
import com.ravens.model.impl.AdminImpl;
import com.ravens.model.impl.BookImpl;
import com.ravens.model.impl.Search_CatalogueImpl;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping("/Admin")
public class AdminController {
    
    
    
     @RequestMapping(value = "/login", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView patronLogin(ModelAndView model) throws IOException {

        model.setViewName("AdminLogin");
        model.addObject("aaa", null);
        return model;
    }

    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView adminLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            ModelAndView model) throws IOException {

        System.out.println("password" + password);
        System.out.println("username" + username);
        AdminImpl adminImpl = new AdminImpl();
        Authentication resp = adminImpl.getAuthentication(username, password, "Admin");
        System.out.println("resp" + resp.getUserName());
        if (resp != null) {

            model.setViewName("addDocument");
            model.addObject("success", resp);
            return model;

        }

        model.setViewName("Adminerror");
        model.addObject("error", null);
        return model;
    }

    @RequestMapping(value = "/addCatalogue", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView addCatalogue(
            @RequestParam("title") String title,
            @RequestParam("authorname") String authorname,
            @RequestParam("publication") String publication,
            @RequestParam("edition") String edition,
            @RequestParam("publicationDate") Date publicationDate,
            ModelAndView model) throws IOException {

        Document doc = new BookImpl();
        System.out.println("title"+title);
        doc.setAuthor(authorname);
        doc.setTitle(title);
        doc.setEdition(edition);
        doc.setPublicationName(publication);
        doc.setPublishedDate(publicationDate);

        Search_CatalogueImpl searchimpl = new Search_CatalogueImpl();
        Document returnDoc = searchimpl.getDocumentDetail(doc);

        if (returnDoc == null) {

            searchimpl.setDocumentDetail(doc);
            model.setViewName("docList");
            model.addObject("success", "doc added");
            return model;

        } else {

            model.setViewName("docList");
            model.addObject("error", "doc already exists");
            return model;
        }

    }

    @RequestMapping(value = "/displayCatalogue", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView displayCatalogue(
            ModelAndView model) throws IOException {

        Search_CatalogueImpl aaa = new Search_CatalogueImpl();
        List<Document> listofdoc = aaa.getDocument();

        model.addObject("listofdoc", listofdoc);
        model.setViewName("docListForAdmin");

        return model;
    }

}
