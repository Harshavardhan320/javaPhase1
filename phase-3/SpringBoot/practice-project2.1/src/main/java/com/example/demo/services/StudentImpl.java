package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.Repository;


@Service
public class StudentImpl implements Operations {
	
	@Autowired
	private Repository repository;

	@Override
	public Student save(Student student) {
		
		return repository.save(student);
	}

	@Override
	public Student update(Student student) {
		return repository.save(student);
	}

	@Override
	public void delete(Student sutdent) {
		 repository.delete(sutdent);
	}

	@Override
	public Student findid(long id) {
		
		return repository.findById(id).get();
	}

	@Override
	public List<Student> findall() {
		return repository.findAll();
	}

}
