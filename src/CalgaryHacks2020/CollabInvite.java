package CalgaryHacks2020;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Set;

public class CollabInvite {


	private Student inviter;
	private ArrayList<Student> possibleCollaborators;
	private Assignment assignment;
	private Schedule inviterSchedule;
	private String nameOfClass;



	/**
	 * @param inviter
	 * @param possibleCollaborators
	 * @param assignment
	 * @param inviterSchedule
	 * @param nameOfClass
	 */
	public CollabInvite(Student inviter, ArrayList<Student> possibleCollaborators, Assignment assignment,
			Schedule inviterSchedule, String nameOfClass) {
		this.inviter = inviter;
		this.possibleCollaborators = possibleCollaborators;
		this.assignment = assignment;
		this.inviterSchedule = inviterSchedule;
		this.nameOfClass = nameOfClass;
	}

	public ArrayList<int[]> findNullTimes(Schedule inviterSchedule) {
		Event[][][] schedule = inviterSchedule.getTempSchedule();
		ArrayList<int[]> freeTimeSlots = new ArrayList<int[]>();
		for (int i = 0; i < 13; i++) {
	        for (int j = 0; j < 7; j++) {
	            for (int k = 0; k < 24; k++) {
	                if (schedule[i][j][k].getEventType().equals("FREETIME")) {
	                	int[] temp = new int[3];
	                	temp[0] = i;
	                	temp[1] = j;
	                	temp[2] = k;
	                	freeTimeSlots.add(temp);
	                }
	            }
	        }
	    }
		return freeTimeSlots;
	}

	public ArrayList<Invite> createInvite(ArrayList<int[]> freeTimeSlots, Assignment assignment, Student inviter, GregorianCalendar dueDate) {
		ArrayList<Invite> newInvites = new ArrayList<Invite>();
		for (int[] timeSlot : freeTimeSlots) {
			//Invite newInvite = new Invite(timeSlot, inviter, assignment, dueDate);
			//newInvites.add(newInvite);
		}
		return newInvites;
	}

	public void sendInvite(String nameOfClass, ArrayList<Invite> invites, ArrayList<Student> possibleCollaborators) {

		for(Student invitee : possibleCollaborators) {
			Schedule inviteeSchedule = invitee.getStudentSchedule();
			Set<String> classSet = inviteeSchedule.getClassSet();
			if (classSet.contains(nameOfClass)) {
				Event[][][] schedule = inviteeSchedule.getTempSchedule();
				for (int n = 0; n < invites.size(); n++) {
					Invite invite = invites.get(n);
					int[] timeSlot = invite.timeSlot;
					int i = timeSlot[0];
					int j = timeSlot[1];
					int k = timeSlot[2];
					if (schedule[i][j][k].getEventType().equals("FREETIME")) {
						//what happens when they are invited to an event
					}
				}
			}
		}
	}

	//if someone accepts
	//make a new event study group and add it to their calendars
}
