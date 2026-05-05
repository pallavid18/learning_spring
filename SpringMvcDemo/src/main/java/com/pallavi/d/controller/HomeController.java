package com.pallavi.d.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
/*	@RequestMapping("/home")
	public String home(Model model) {
		return "home";		
		
	}
*/
	@RequestMapping("/home")
	public ModelAndView home(Model model) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("Name","Riya");
		modelAndView.addObject("Id",101);
		modelAndView.addObject("Salary",40000);
		return modelAndView;

	}
	
}
