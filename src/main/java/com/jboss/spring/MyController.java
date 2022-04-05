package com.jboss.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


@RestController
public class MyController {
	
	private static Logger log = Logger.getLogger(MyController.class);
	
	static {
		try {
			PropertyConfigurator.configure(System.getProperty("FIRST")+File.separator+"java"+File.separator+"log4j.properties");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		 log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message"); 
	      String str= System.getProperty("FIRST");
		
		return "Hello, All !";
		
	}
	
	@RequestMapping("/")
	public String hello() {
		 log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message");  
		
	      String str= System.getProperty("FIRST");
		return str;
		
	}

	
	
}
