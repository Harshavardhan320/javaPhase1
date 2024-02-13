package school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import school.entity.Student;
import school.repository.Repository;

@RestController
public class Controller {
	
	@Autowired
	Repository repository;
	
	@GetMapping(name="allsutdents")
	public String Allstudence() {
		
		List<Student> a=repository.findAll();
		for (Student student : a) {
			System.out.println("Name "+student.getName()+" Id"+student.getName());
		}
		return "result";
	}
}
