package com.springmvc.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;;

public class WebApplicationInitializer implements org.springframework.web.WebApplicationInitializer {

	public static final Logger logger = LoggerFactory.getLogger(WebApplicationInitializer.class);

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// Create spring context
		AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();

		// Register Spring Configurations
		
		springContext.register(MvcConfig.class);//loads all the imp beans config
		springContext.register(PersistenceConfig.class);//Db related datasource, hibernate sessions config
		springContext.register(WebSecurityConfig.class);//Configuration related to the Web Authentication

		// Spring MVC dispatcher servlet configuration
		servletContext.addListener(new ContextLoaderListener(springContext));
		DispatcherServlet mvcDispatcherServlet = new DispatcherServlet(springContext);

		//All requests hit the dispatcher servlet
		ServletRegistration.Dynamic mvcReg = servletContext.addServlet("dispatcher", mvcDispatcherServlet);
		
		mvcReg.setLoadOnStartup(1);
		mvcReg.addMapping("/");
	}
}