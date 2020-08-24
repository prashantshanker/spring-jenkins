package com.luv2code.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application starter ......");
	}

	public static void main(String[] args) {
		logger.info("Application executed ......");

		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
