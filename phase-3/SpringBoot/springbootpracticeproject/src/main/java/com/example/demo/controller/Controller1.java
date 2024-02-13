package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Student;
import com.example.demo.repository.Repository1;

@Controller
public class Controller1 {
	
	@Autowired
	Repository1 repository;
	
	@GetMapping("/allsutdents")
	public String Allstudence(ModelMap map) {
		
		List<Student> a=repository.findAll();
		
		map.addAttribute("listofstud", a);
		
		return "result";
	}
}
