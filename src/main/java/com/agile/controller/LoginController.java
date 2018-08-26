package com.agile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

	@GetMapping("/agile/test")
	public String test() {
		return "Welcome";
	}
	
	@GetMapping(value="/user/{userName}/{password}")
	public String login(@PathVariable(value="userName") String userName, @PathVariable(value="password") String password)
	{
		
		String response = null;
		if(userName.equals("admin")&&password.equals("admin")) {
			response = "success";
			System.out.println("----Validation success-----");
		}
		else {
			response = "failure";
			System.out.println("----Validation failure-----");
		}
		return response;
	}
}
