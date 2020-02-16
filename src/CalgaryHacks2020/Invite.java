package CalgaryHacks2020;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Invite {
	int[] timeSlot;
	ArrayList<Student> students;
	Assignment assignment;
	GregorianCalendar dueDate;
	
	/**
	 * @param timeSlot
	 * @param inviter
	 * @param assignment
	 * @param dueDate
	 */
	public Invite(int[] timeSlot, ArrayList<Student> students, Assignment assignment, GregorianCalendar dueDate) {
		this.timeSlot = timeSlot;
		this.students = students;
		this.assignment = assignment;
		this.dueDate = dueDate;
	}
	
	public void addStudent(ArrayList<Student> students, Student studentToAdd) {
		students.add(studentToAdd);
	}

}
