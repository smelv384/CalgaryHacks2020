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
	public Invite(int[] timeSlot, ArrayList<Student> students, Assignment assignment) {
		this.timeSlot = timeSlot;
		this.students = students;
		this.assignment = assignment;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public Assignment getAssignment() {
		return assignment;
	}

	public int[] getTimeSlot() {
		return timeSlot;
	}

	public void addStudent(ArrayList<Student> students, Student studentToAdd) {
		students.add(studentToAdd);
	}

	@Override
    public String toString() {
	    String returnString = this.assignment.getName() + " \n";
	    returnString = returnString + assignment.getClassName() + " \n";
	    for (Student student : students) {
	        returnString = returnString + student.getName() + " \n";
	    }
	    return returnString;

	}

}
