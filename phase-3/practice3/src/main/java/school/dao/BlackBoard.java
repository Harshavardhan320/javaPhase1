package school.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import school.Student;

public class BlackBoard implements School {
	
	private JdbcTemplate jdbcTemplete;
	
	
	
	public JdbcTemplate getJdbcTemplete() {
		return jdbcTemplete;
	}



	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}



	@Override
	public List<Student> ptintstudent() {
		
		RowMapperres rs = new RowMapperres(); 
		
		List<Student> list = jdbcTemplete.query("select * from student",rs);
		return list;
	}

}
