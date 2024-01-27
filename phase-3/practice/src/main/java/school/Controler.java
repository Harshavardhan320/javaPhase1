package school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controler {
	public static void main(String args[]) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("school/config.xml");
		
//		Student std = (Student)con.getBean("std");
//		
//		System.out.println(std.getName()+" -name");
//		System.out.println("roll- "+std.getRollno());
//		System.out.println("address- "+std.getAddress());
		
		
		subjects sub = (subjects)con.getBean("sub");
		
		System.out.println("Name "+sub.getStd().getName());
		System.out.println("roll "+sub.getStd().getRollno());
		System.out.println("subject name "+sub.getSubject());
		System.out.println("marks "+sub.getMarks());



	}
}
