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

	public static StringFrame stringFrame;
	public static ClassPanel classPanel;
	public static AssignmentPanel assignmentPanel;
	public static MainPanel mainPanel;
	public static GroupsPanel groupsPanel;
	public static NotificationPanel notificationPanel;
	public static Student user;


    public static void main(String[] args) {
    	System.out.println("Hello world!");
        StudentReader reader = new StudentReader();
        //creating dummy students to interact with the user
        Student alice = reader.read(".\\src\\CalgaryHacks2020\\Students\\Alice.txt", ".\\src\\CalgaryHacks2020\\Students\\AliceSchedule.txt");
        Student bob = reader.read(".\\src\\CalgaryHacks2020\\Students\\Bob.txt", ".\\src\\CalgaryHacks2020\\Students\\BobSchedule.txt");
        Student charlie = reader.read(".\\src\\CalgaryHacks2020\\Students\\Charlie.txt", ".\\src\\CalgaryHacks2020\\Students\\CharlieSchedule.txt");
        Student darren = reader.read(".\\src\\CalgaryHacks2020\\Students\\Darren.txt", ".\\src\\CalgaryHacks2020\\Students\\DarrenSchedule.txt");
        Student evan = reader.read(".\\src\\CalgaryHacks2020\\Students\\Evan.txt", ".\\src\\CalgaryHacks2020\\Students\\EvanSchedule.txt");

        allStudents = new ArrayList<>();
        allStudents.add(alice);
        allStudents.add(bob);
        allStudents.add(charlie);
        allStudents.add(darren);
        allStudents.add(evan);

        String name;
        String ucID;
        boolean exit = false;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter your name");
        name = kb.next();
        System.out.println("Please enter your ucID");
        ucID = kb.next();


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

    public static void viewCollabRequests() {
        //show list of collab requests
    }

    public static void viewSchedule() {

        //present user.getSchedule
        if (/*User selects to create an assignment*/) {

        }
    }

    public static void addAssignment(Event dateTime) {


        Assignment newAssignment = new Assignment();
        if (/*some condition, will be set in the GUI*/) {
            createCollabRequest();
        }

    }

    public static void createCollabRequest(Assignment asgCollab) {
        CollabInvite collabRequest = new CollabInvite(user, allStudents, asgCollab, user.getStudentSchedule(),
                asgCollab.getClassName());



    }

}
