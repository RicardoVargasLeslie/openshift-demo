package com.imricki.cloud.openshift.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoController {

	@GetMapping("/hi")
	public String sayHi() {
		
		return  "Hi From the Cloud";
	}
	
	@GetMapping("/hi/{name}")
	public String sayHiByname(@PathVariable String name) {
		
		return  "Hi " + name + " from the Cloud";
	}
}
