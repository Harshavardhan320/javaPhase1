package school.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import school.Student;

public class RowMapperres implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std = new Student();
		
		std.setId(rs.getInt(1));
		std.setName(rs.getString(2));
		
		return std;
	}

}
