/**
 * Main class for the CalgaryHacks2020 hackathon, by the U of C-MRU Coalition for the Purpose of Victory in CalgaryHacks2020
 * Author: Shaemus Melvin
 */

package CalgaryHacks2020;
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
    public static ArrayList<Invite> allInvitations;

	public static StringFrame stringFrame;
	public static ClassPanel classPanel;
	public static AssignmentPanel assignmentPanel;
	public static MainPanel mainPanel;
	public static GroupsPanel groupsPanel;
	public static NotificationPanel notificationPanel;



    public static void main(String[] args) {
    	System.out.println("Hello world!");
        StudentReader reader = new StudentReader();
        //creating dummy students to interact with the user
        Student alice = reader.read(".\\src\\CalgaryHacks2020\\Students\\Alice.txt", ".\\src\\CalgaryHacks2020\\Students\\AliceSchedule.txt");
        Student bob = reader.read(".\\src\\CalgaryHacks2020\\Students\\Bob.txt", ".\\src\\CalgaryHacks2020\\Students\\BobSchedule.txt");
        Student charlie = reader.read(".\\src\\CalgaryHacks2020\\Students\\Charlie.txt", ".\\src\\CalgaryHacks2020\\Students\\CharlieSchedule.txt");
        Student darren = reader.read(".\\src\\CalgaryHacks2020\\Students\\Darren.txt", ".\\src\\CalgaryHacks2020\\Students\\DarrenSchedule.txt");
        Student evan = reader.read(".\\src\\CalgaryHacks2020\\Students\\Evan.txt", ".\\src\\CalgaryHacks2020\\Students\\EvanSchedule.txt");
        allInvitations = new ArrayList<>();
        allStudents = new ArrayList<>();
        allStudents.add(alice);
        allStudents.add(bob);
        allStudents.add(charlie);
        allStudents.add(darren);
        allStudents.add(evan);

        ArrayList<Student> aliceList = new ArrayList<>();
        aliceList.add(alice);
        Invite newInvite = new Invite(new int[] {0, 3, 13}, aliceList, new Assignment("Midterm", new int[] {4, 1, 13}, 5, "PSYC205001"));
        allInvitations.add(newInvite);

        ArrayList<Student> mathList = new ArrayList<>();
        mathList.add(charlie);
        mathList.add(bob);
        newInvite = new Invite(new int[] {1, 4, 16}, mathList, new Assignment("Assignment 1", new int[] {2, 3, 7}, 2, "MATH279001"));
        allInvitations.add(newInvite);

        ArrayList<Student> darrenList = new ArrayList<>();
        darrenList.add(darren);
        newInvite = new Invite(new int[] {1, 2, 8}, darrenList, new Assignment("Quiz 1", new int[] {1, 4, 1}, 1, "PHIL377001"));
        allInvitations.add(newInvite);

        ArrayList<Student> evanList = new ArrayList<>();
        evanList.add(evan);
        newInvite = new Invite(new int[] {2, 4, 8}, evanList, new Assignment("Deliverable 2", new int[] {3, 5, 10}, 3, "SENG300001"));
        allInvitations.add(newInvite);

        String name = "SGA";
        String ucID = "531";
        boolean exit = false;

        Scanner kb = new Scanner(System.in);



        ScheduleBuilder myScheduleBuilder = new ScheduleBuilder();
        Schedule studentSchedule = myScheduleBuilder.read(".\\src\\CalgaryHacks2020\\Students\\MyStudentSchedule.txt");

        user = new Student(name, studentSchedule, ucID);
        System.out.println(user.getName());

        //start up the GUI
		classPanel = new ClassPanel();
		assignmentPanel = new AssignmentPanel();
		groupsPanel = new GroupsPanel();
		mainPanel = new MainPanel();
		notificationPanel = new NotificationPanel();
		stringFrame = new StringFrame();
		stringFrame.start();

        while (!exit) {
            System.out.println("What would you like to do?\n"
                    + "View collaboration requests\n"
                    + "View schedule\n"
                    + "Exit");
            if (kb.next().equals("Exit")) {
                exit = true;
            }
        }

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
    
    public static void acceptCollabRequest(ArrayList<Invite> userInvitations) {
    	
    	
    }

    public static void viewSchedule() {

        //present user.getSchedule
        if (/*User selects to create an assignment*/) {

        }
    }

    public static void addAssignment(String name, int[] dateTime, int hours) {

        Assignment newAssignment = new Assignment(name, dateTime, hours,
                user.getStudentSchedule().getTempSchedule()[dateTime[0]][dateTime[1]][dateTime[2]].getClassName());

        if (/*some condition, will be set in the GUI*/) {
            createCollabRequest(newAssignment);
        }

    }

    public static void createCollabRequest(Assignment asgCollab) {
        ArrayList<ArrayList<Object>> studentsToInvite = CollabInvite.makeACollabInvite(user, allStudents, asgCollab);
    }

}
