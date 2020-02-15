package CalgaryHacks2020;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<String> intrests = new ArrayList<String>();
	private boolean allowMatching = false;
	
	
	public Student(Student student)
	{
		this.name = student.name;
		this.intrests = student.intrests;
	}
	
	
}
