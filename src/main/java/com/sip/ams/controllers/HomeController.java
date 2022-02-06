package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/info")
	public String info()
	{
		System.out.println("méthode affichage");
		return "home/info";
	}
	
	@RequestMapping("/affichage")
	public String affichage()
	{
		System.out.println("méthode info");
		return "home/affichage";
	}
	
	

}
