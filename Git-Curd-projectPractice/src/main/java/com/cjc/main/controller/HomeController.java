package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/getData")
public String preLog()
{
	return "success";
	
}
	@GetMapping("/postData")
	public String postData()
	{
		return "data post Successfully";
		
	}
}
