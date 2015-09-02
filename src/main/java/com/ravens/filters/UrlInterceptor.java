/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ravens.filters;

import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author natarajmehalingam
 */


public class UrlInterceptor implements HandlerInterceptor {
    
   
    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        
       
        
        // Get an UserAgentStringParser and analyze the requesting client
//        UserAgentStringParser parser = UADetectorServiceFactory.getResourceModuleParser();
//        ReadableUserAgent agent = parser.parse(request.getHeader("User-Agent"));
//
//        ObjectMapper mapper = new ObjectMapper();
        
        //FakeRequest freq=new FakeRequest(request,mapper.writeValueAsString(agent));
        String Schema=(String)request.getAttribute("thought");
        
        System.out.println(request.getRequestURL()+"---"+request.getSession().getAttribute("VAR"));
         
         
        return true;
    }
     
    @Override
    public void postHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("Post-handle");
    }
     
    @Override
    public void afterCompletion(HttpServletRequest request,
            HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("After completion handle");
    }
}

