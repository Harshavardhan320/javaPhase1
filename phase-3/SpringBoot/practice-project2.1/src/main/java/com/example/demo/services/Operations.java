package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Student;

public interface Operations {
	public Student save(Student student);
	public Student update(Student student);
	public void delete(Student sutdent);
	public Student findid(long id);
	public List<Student> findall();
	
}
