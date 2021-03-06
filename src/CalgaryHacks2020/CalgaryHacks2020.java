
/**
 * Main class for the CalgaryHacks2020 hackathon, by the U of C-MRU Coalition for the Purpose of Victory in CalgaryHacks2020
 * Author: Shaemus Melvin
 */

package CalgaryHacks2020;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import GUI.AssignmentPanel;
import GUI.ClassPanel;
import GUI.GroupsPanel;
import GUI.MainPanel;
import GUI.NotificationPanel;
import GUI.StringFrame;


public class CalgaryHacks2020 {

    public static Student user;
    public static ArrayList<Student> allStudents;
    public static ArrayList<Invite> userInvitations;

	public static StringFrame stringFrame;
	public static ClassPanel classPanel;
	public static AssignmentPanel assignmentPanel;
	public static MainPanel mainPanel;
	public static GroupsPanel groupsPanel;
	public static NotificationPanel notificationPanel;



    public static void main(String[] args) {

        //creating dummy students to interact with the user
        Student alice = new Student("alice", new Schedule(), "30");
        Student bob = alice;
        Student charlie = alice;
        Student darren = alice;
        Student evan = alice;
        try {
            alice = StudentReader.read(".\\src\\CalgaryHacks2020\\Students\\Alice.txt", ".\\src\\CalgaryHacks2020\\Students\\AliceSchedule.txt");
            bob = StudentReader.read(".\\src\\CalgaryHacks2020\\Students\\Bob.txt", ".\\src\\CalgaryHacks2020\\Students\\BobSchedule.txt");
            charlie = StudentReader.read(".\\src\\CalgaryHacks2020\\Students\\Charlie.txt", ".\\src\\CalgaryHacks2020\\Students\\CharlieSchedule.txt");
            darren = StudentReader.read(".\\src\\CalgaryHacks2020\\Students\\Darren.txt", ".\\src\\CalgaryHacks2020\\Students\\DarrenSchedule.txt");
            evan = StudentReader.read(".\\src\\CalgaryHacks2020\\Students\\Evan.txt", ".\\src\\CalgaryHacks2020\\Students\\EvanSchedule.txt");
        } catch (FileNotFoundException e) {
            System.out.println("This should not happen");
        }
        userInvitations = new ArrayList<>();
        allStudents = new ArrayList<>();
        allStudents.add(alice);
        allStudents.add(bob);
        allStudents.add(charlie);
        allStudents.add(darren);
        allStudents.add(evan);

        ArrayList<Student> aliceList = new ArrayList<>();
        aliceList.add(alice);
        Invite newInvite = new Invite(new int[] {0, 3, 13}, aliceList, new Assignment("Midterm", new int[] {4, 1, 13}, 5, "PSYC205001"));
        userInvitations.add(newInvite);

        ArrayList<Student> mathList = new ArrayList<>();
        mathList.add(charlie);
        mathList.add(bob);
        newInvite = new Invite(new int[] {1, 4, 16}, mathList, new Assignment("Assignment 1", new int[] {2, 3, 7}, 2, "MATH279001"));
        userInvitations.add(newInvite);

        ArrayList<Student> darrenList = new ArrayList<>();
        darrenList.add(darren);
        newInvite = new Invite(new int[] {1, 2, 8}, darrenList, new Assignment("Quiz 1", new int[] {1, 4, 1}, 1, "PHIL377001"));
        userInvitations.add(newInvite);

        ArrayList<Student> evanList = new ArrayList<>();
        evanList.add(evan);
        newInvite = new Invite(new int[] {2, 4, 8}, evanList, new Assignment("Deliverable 2", new int[] {3, 5, 10}, 3, "SENG300001"));
        userInvitations.add(newInvite);

        String name = "Shaemus Melvin";
        String ucID = "301785037";

        Scanner kb = new Scanner(System.in);




        Schedule studentSchedule = new Schedule();
        try {
            studentSchedule = ScheduleBuilder.read(".\\src\\CalgaryHacks2020\\Students\\MyStudentSchedule.txt");
        } catch (FileNotFoundException e) {
            //block intentionally left empty
        }

        user = new Student(name, studentSchedule, ucID);

        //start up the GUI
		classPanel = new ClassPanel();
		assignmentPanel = new AssignmentPanel();
		groupsPanel = new GroupsPanel();
		mainPanel = new MainPanel();
		notificationPanel = new NotificationPanel();

		for (Invite invitation: userInvitations) {
		    notificationPanel.addInviteToList(invitation);
		}

		for (String className : user.getStudentSchedule().getClassSet()) {
            classPanel.addClassToList(className);
        }

	    stringFrame = new StringFrame();
		stringFrame.start();




        kb.close();

    }

    public static ArrayList<Invite> viewCollabRequests(ArrayList<ArrayList<Object>> allInvitations) {
        //show list of collab requests
    	ArrayList<Invite> userInvitations = new ArrayList<Invite>();
    	for (ArrayList<Object> invitation : allInvitations) {
    		if (invitation.get(0) == user) {
    			userInvitations.add((Invite)invitation.get(1));
    		}
    	}
    	return userInvitations;
    }

    public static void acceptCollabRequest(ArrayList<Invite> userInvitations, int indexOfInviteToAccept) {
    	//add user to the students list of the invite
    	Invite acceptedInvite = userInvitations.get(indexOfInviteToAccept);
    	ArrayList<Student> students = new ArrayList<Student>(acceptedInvite.getStudents());
    	acceptedInvite.addStudent(students, user);
    	//add assignment to the user's assignments
    	String name = acceptedInvite.getAssignment().getName();
    	int[] dateTime = acceptedInvite.getAssignment().getDate();
    	int hours = acceptedInvite.getAssignment().getHours();
    	addAssignment(name, dateTime, hours);
    	//add invite timeSlot to schedule
    	int[] timeSlotToAdd = acceptedInvite.timeSlot;
    	Event[][][] userSchedule = user.getStudentSchedule().getTempSchedule();
    	int i = timeSlotToAdd[0];
    	int j = timeSlotToAdd[1];
    	int k = timeSlotToAdd[2];
    	userSchedule[i][j][k].setEventType(2);
    }

    public static void addAssignment(String name, int[] dateTime, int hours) {

        Assignment newAssignment = new Assignment(name, dateTime, hours,
                user.getStudentSchedule().getTempSchedule()[dateTime[0]][dateTime[1]][dateTime[2]].getClassName());
        assignmentPanel.addAssignmentToList(newAssignment);
        boolean collabRequest = false;

        if (collabRequest) {
            createCollabRequest(newAssignment);
        }

    }

    public static ArrayList<ArrayList<Object>> createCollabRequest(Assignment asgCollab) {
        ArrayList<ArrayList<Object>> studentsToInvite = CollabInvite.makeACollabInvite(user, allStudents, asgCollab);
        return studentsToInvite;
    }

}
