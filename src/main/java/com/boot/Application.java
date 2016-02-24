package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;


/**
 * The {@link #main(String[])} method is an entry point and can be used to start the entire application, including
 * an embedded Tomcat instance.
 * <p/>
 * However, this class is also a {@link org.springframework.boot.context.web.SpringBootServletInitializer SpringBootServletInitializer}
 * subclass and so can be deployed into a traditional Servlet 3 container (Apache Tomcat 7, Jetty 9, JBoss AS 6, etc.)
 * and run from there, as well.
 */


public class Application extends SpringBootServletInitializer  {
	private static Class<Application> entryPointClass = Application.class;
    public static void main(String[] args) {
        SpringApplication.run(entryPointClass, args);
    }

}
