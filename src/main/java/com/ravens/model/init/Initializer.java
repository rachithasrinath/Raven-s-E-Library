package com.ravens.model.init;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer {

    @Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		
            AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebAppConfig.class);
		servletContext.addListener(new ContextLoaderListener(ctx));
                ctx.setServletContext(servletContext);

		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
                servlet.setInitParameter("contextConfigLocation", "/WEB-INF/mvc-dispatcher-servlet.xml");
		servlet.addMapping("/api/*");
		servlet.setLoadOnStartup(1);
              
            
              String[] pattern=new String[1];
              pattern[0]="/*";
              
        }

}

