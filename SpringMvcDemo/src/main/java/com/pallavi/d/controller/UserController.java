package com.pallavi.d.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pallavi.d.dao.User;

@Controller
public class UserController {

	@GetMapping
	public ModelAndView showRegPage(Model model) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("userReg");
		return mv;

	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
//		mv.setViewName("userReg");
		mv.addObject(user);
		mv.setViewName("result");
		return mv;
	}

}
