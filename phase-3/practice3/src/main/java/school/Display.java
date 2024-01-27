package school;

import java.util.List;

import school.dao.BlackBoard;
import school.dao.School;

public class Display {
	public  School school;
		
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public void main() {
		
		List<Student> std = school.ptintstudent();
		
		System.out.println(std);
		
	}
}
