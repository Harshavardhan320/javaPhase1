package school.view;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import school.Controller;
import school.Student;

public class Model {

	private JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Student> displaystudent(){
		
		Controller coll = new Controller();
		
		List<Student> std = jdbcTemplate.query("select*from student", coll);
		
		return std;		
	}
	
	public void insert(String name) {
		
		if(name != null) {
			
			jdbcTemplate.update("insert into student(studentname)value(?)", name);
			
			System.out.println("Sucessfully Uploaded");
		}
	}
}
