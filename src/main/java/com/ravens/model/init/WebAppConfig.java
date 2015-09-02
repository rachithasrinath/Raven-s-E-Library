package com.ravens.model.init;


import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import com.ravens.filters.UrlInterceptor;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ravens")
@EnableWebMvc
@EnableTransactionManagement




public class WebAppConfig extends WebMvcConfigurerAdapter {

 
    
    @Resource
    private Environment env;

   

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
     @Bean
        public UrlInterceptor UrlInterceptor() {
            return new UrlInterceptor();
        }

        public @Override void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(UrlInterceptor());
        }
    

  
}
