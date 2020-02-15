/*
 * Written for CalgaryHacks2020
 * Author: Shaemus Melvin
 */
package CalgaryHacks2020;
import java.util.HashSet;

public class Student {

    public enum Major {
        COMPUTERSCIENCE, MECHENG, GENDERSTUDIES, ACCOUNTING
    }
	private String name;
	private Schedule studentSchedule;
	private final String ucID;
	private HashSet<String> classes;



	public Student(String name, Schedule studentSchedule, String ucID, HashSet<String> classes)
	{
		this.name = name;
		this.studentSchedule = studentSchedule;
		this.ucID = ucID;
		this.classes = classes;

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

	public HashSet<String> getClasses() {
	    return classes;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public void setSchedule(Schedule studentSchedule) {
	    this.studentSchedule = studentSchedule;
	}

	public void addClass(String studentClass) {
	    classes.add(studentClass);
	}


}
