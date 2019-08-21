package com.helo.escom.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class TestController {

	 @RequestMapping("/")
	    public String index(Model model){
	        model.addAttribute("datetime", new Date());
	        model.addAttribute("username", "Ayy myjito precioso!!!");

	        return "index";
	    }
	
}
