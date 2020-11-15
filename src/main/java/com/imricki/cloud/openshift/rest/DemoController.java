package com.imricki.cloud.openshift.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(DemoController.BASE_URL)
public class DemoController {

	public static final String BASE_URL = "/api/v1";

	
	
	@GetMapping("/hi")
	public String sayHi() {
		
		return  "Hi From the Cloud";
	}
}
