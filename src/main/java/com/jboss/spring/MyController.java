package com.jboss.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;


@RestController
public class MyController {
	
	private static Logger log = Logger.getLogger(MyController.class);
	
	@RequestMapping("/hello")
	public String sayHello() {
		 log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message");  
		
		return "Hello, Application is running on JBOSS EAP 7.2";
		
	}
	
	@RequestMapping("/")
	public String hello() {
		 log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message");  
		
		return "Welcome Back !";
		
	}

	
	
}
