/**
 * The collaboration invitation class for the CalgaryHacks2020 hackathon
 * by the U of C-MRU Coalition for the Purpose of Victory in CalgaryHacks2020
 * Author: Alexanna Little
 */

package CalgaryHacks2020;
import java.util.ArrayList;
import java.util.Set;

public class CollabInvite {


	private Student inviter;
	private ArrayList<Student> possibleCollaborators;
	private Assignment assignment;



	/**
	 * @param inviter - The person who is broadcasting their need for a study partner
	 * @param possibleCollaborators - Every other student in the program - evaluated for other factors later
	 * @param assignment - The assignment/test that is being studied for
	 * @param inviterSchedule - The schedule of the inviter - used to send invites
	 * @param nameOfClass - The name of the class that's being studied for
	 */
	public CollabInvite(Student inviter, ArrayList<Student> possibleCollaborators, Assignment assignment) {
		this.inviter = inviter;
		this.possibleCollaborators = possibleCollaborators;
		this.assignment = assignment;
	}

	//This method finds all of the time in the inviter's schedule where they have free time, through an
	//array list of time slots (stored in the form of 3 integers)
	public ArrayList<int[]> findNullTimes(Schedule inviterSchedule) {
		Event[][][] schedule = inviter.getStudentSchedule().getTempSchedule();
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


	//This class creates an invite for every free timeslot the inviter has in their schedule
	public ArrayList<Invite> createInvite(ArrayList<int[]> freeTimeSlots, Assignment assignment, Student inviter) {
		ArrayList<Invite> newInvites = new ArrayList<Invite>();
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(inviter); //inviter is added as a student since "students" means students working on the collaboration
		for (int[] timeSlot : freeTimeSlots) {
			Invite newInvite = new Invite(timeSlot, students, assignment);
			newInvites.add(newInvite);
		}
		return newInvites;
	}

	//This method goes through the list of potential invitees and selects those which are eligible to
	//collaborate with the inviter (i.e. it shows the invitee what times they're available to collaborate)
	public ArrayList<ArrayList<Object>> sendInvite(String nameOfClass, ArrayList<Invite> invites, ArrayList<Student> possibleCollaborators) {
		ArrayList<ArrayList<Object>> studentsToInvite = new ArrayList<ArrayList<Object>>();
		for(Student invitee : possibleCollaborators) {

		    //For every student in possible collaborators, get their schedule and their set of classes
			Schedule inviteeSchedule = invitee.getStudentSchedule();
			Set<String> classSet = inviteeSchedule.getClassSet();

			//If the student is in the class of the collaboration invite, check every time slot that's
			//also in the array list of free slots, created in the above method.  If they're free,
			//add the invitee to an invitation
			if (classSet.contains(nameOfClass)) {
				Event[][][] schedule = inviteeSchedule.getTempSchedule();
				for (int n = 0; n < invites.size(); n++) {
					Invite invite = invites.get(n);
					int[] timeSlot = invite.timeSlot;
					int i = timeSlot[0];
					int j = timeSlot[1];
					int k = timeSlot[2];
					if (schedule[i][j][k].getEventType().equals("FREETIME")) {
						ArrayList<Object> invitation = new ArrayList<Object>();
						invitation.add(invitee);
						invitation.add(invite);
						studentsToInvite.add(invitation);
					}
				}
			}
		}
		return studentsToInvite;
	}

	//if someone accepts
	//make a new event study group and add it to their calendars
}
