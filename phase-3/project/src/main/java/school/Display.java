package school;

import java.util.List;

import school.view.Model;

public class Display {
	
	private Model model;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	public void studentdisplay() {
		List<Student> list = model.displaystudent();
		
		for (Student student : list) {
			System.out.println("Studrnt Id:--"+student.getId()+" Student Name:--"+student.getName());
		}
	}
	public void addstudent(String name) {
		model.insert(name);
	}
}
