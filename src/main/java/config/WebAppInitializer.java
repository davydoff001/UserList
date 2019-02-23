/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.springframework.web.WebApplicationInitializer;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author Alexandr
 */
public class WebAppInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext servletcontext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringConfig.class,WebConfig.class);
        context.setServletContext(servletcontext);
        ServletRegistration.Dynamic dispatcher = servletcontext.addServlet("dispatcher", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
    
}
