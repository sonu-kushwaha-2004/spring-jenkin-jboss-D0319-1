package com.jboss.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJbossApplication {
	
	//private static Logger log = Logger.getLogger(MyController.class);
	private static final Logger log = LogManager.getLogger(MyController.class);
	

	public static void main(String[] args) {
		SpringApplication.run(SpringJbossApplication.class, args);
		log.info("info");
		log.debug("debug");
		log.error("error");
		log.fatal("fetal");
	}

}
