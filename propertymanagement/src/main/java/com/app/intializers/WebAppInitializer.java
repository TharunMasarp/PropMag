package com.app.intializers;

/*import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;*/

public class WebAppInitializer /*implements WebApplicationInitializer*/{

	/*@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		webAppContext.setConfigLocation("com.app.intializers");
		servletContext.addListener(new ContextLoaderListener(webAppContext));
		ServletRegistration.Dynamic dispatcher =  servletContext.addServlet("dispatcher", new DispatcherServlet(webAppContext));
		dispatcher.addMapping("*.htm");
		dispatcher.setLoadOnStartup(1);*/
		
	}

}
