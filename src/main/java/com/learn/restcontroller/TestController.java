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
		String st1="<h1 style='color:red'> this is h1 Heading</h1>";
		String st2="<h2> this is h1 Heading</h2>";
		String st3="<h3> this is h1 Heading</h3>";
		
		return "<h1 style='color:red'> this is h1 Heading</h1>";
	}
	
	
	@GetMapping("/home")
	public String home1()
	{
		return "This is Home1 Page";
	}
	
	
	
}
