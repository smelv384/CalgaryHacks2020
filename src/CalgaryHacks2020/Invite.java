package CalgaryHacks2020;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Invite {
	int[] timeSlot;
	Student inviter;
	Assignment assignment;
	GregorianCalendar dueDate;
	
	/**
	 * @param timeSlot
	 * @param inviter
	 * @param assignment
	 * @param dueDate
	 */
	public Invite(int[] timeSlot, Student inviter, Assignment assignment, GregorianCalendar dueDate) {
		this.timeSlot = timeSlot;
		this.inviter = inviter;
		this.assignment = assignment;
		this.dueDate = dueDate;
	}

}
