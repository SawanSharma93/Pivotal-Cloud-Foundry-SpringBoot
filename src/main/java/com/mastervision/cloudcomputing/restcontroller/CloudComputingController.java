package com.mastervision.cloudcomputing.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudComputingController {
	final Logger logger = LoggerFactory.getLogger(CloudComputingController.class);
   @RequestMapping(value="cloudcomputing/{token}")
	public String welcomeMessage(@PathVariable("token") String token) {
		if (token.equals("s@w")) {
			return "Cloud Computing Deployment Successsfull ! ";
			
		}

		else {
			return "Not valid Token";
			
		}

	}

}
