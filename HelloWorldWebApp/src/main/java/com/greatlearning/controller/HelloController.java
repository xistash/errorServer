package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     //stereotype annotation of @componenT
public class HelloController {
	
	//adding the request mapping 
	@RequestMapping("/hello")
	public String giveHelloMessage() {
		return "hello";
	}
	

}
