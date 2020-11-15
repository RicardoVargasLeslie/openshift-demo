package com.imricki.cloud.openshift.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hi")
	public String sayHi() {
		
		return  "Hi From the Cloud";
	}
}
