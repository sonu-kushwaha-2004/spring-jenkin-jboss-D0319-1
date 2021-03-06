package com.jboss.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;


@RestController
public class MyController {
	
	//private  static  final Logger log = Logger.getLogger(MyController.class);
	
	private static final Logger log = LogManager.getLogger(MyController.class);
	
//	static {
//		try {
//			//PropertyConfigurator.configure(System.getProperty("FIRST")+File.separator+"java"+File.separator+"log4j.properties");
//		//	PropertyConfigurator.configure("E:/Log/java/log4j.properties");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
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
	      str="Value of FIRST from Standalone file of wildfly server : "+str;
		return str;
		
	}

	
	
}
