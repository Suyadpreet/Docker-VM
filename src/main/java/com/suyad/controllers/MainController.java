package com.suyad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
	@Autowired
	Environment env;
	@GetMapping("/wel")
	public String getWel()
	{
		return "Application running on " +env.getProperty("server.port");
	}
}
