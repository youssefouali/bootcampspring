package com.sip.ams.controllers;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/info")
	public String info(Model model)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("OCA");
		names.add("OCP");
		names.add("Spring");
		model.addAttribute("names", names);
		String formation = "Fullstack";
		System.out.println("Méthode info");
		
		
		model.addAttribute("workshop",formation);
		
		return "home/info";  // le nom de la vue sous template /home
		
		
		
	}
	
	@RequestMapping("/affichage")
	public String affichage()
	{
		System.out.println("méthode info");
		return "home/affichage";
	}
	
	

}
