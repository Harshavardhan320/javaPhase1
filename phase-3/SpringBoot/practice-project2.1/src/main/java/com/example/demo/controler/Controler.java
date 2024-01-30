package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentImpl;

@RestController
public class Controler {
	
	@Autowired
	private StudentImpl studentImpl;
	
//	
//	@GetMapping("/")
	public List<Student> insert() {
		
		
//		Student student = new Student();
//		
//		student.setStudentname("vikas");
//		
//		studentImpl.save(student);
//		
//		return "name"+student.getStudentname()+" with ID"+student.getId()+" saved successfully";
		
		List<Student> allstudents= studentImpl.findall();
		
		return allstudents;
	}
	
	@GetMapping("/")
	public String welcome() {
		
		return "index";
	}

}
