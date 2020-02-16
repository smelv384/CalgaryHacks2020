/*
 * Written for CalgaryHacks2020
 * Author: Shaemus Melvin
 */
package CalgaryHacks2020;

public class Student {

	private String name;
	private Schedule studentSchedule;
	private final String ucID;



	public Student(String name, Schedule studentSchedule, String ucID) {
		this.name = name;
		this.studentSchedule = studentSchedule;
		this.ucID = ucID;

	}

	public String getName() {
	    return name;
	}

	public Schedule getStudentSchedule() {
	    return studentSchedule;
	}

	public String getUcID() {
	    return ucID;
	}


	public void setName(String name) {
	    this.name = name;
	}

	public void setSchedule(Schedule studentSchedule) {
	    this.studentSchedule = studentSchedule;
	}



}
