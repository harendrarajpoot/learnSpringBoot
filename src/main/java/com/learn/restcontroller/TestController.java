package com.learn.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	/*@GetMapping
	public String home()
	{
		return "This is Home";
	}*/
	
	@GetMapping("/")
	public String home()
	{
		return "<h1 style='color:red'>This is Home with slash</h1>";
	}
	
	
	@GetMapping("/home")
	public String home1()
	{
		return "This is Home1 Page";
	}
	
	
	
}
