/**
 * Main class for the CalgaryHacks2020 hackathon, by the U of C-MRU Coalition for the Purpose of Victory in CalgaryHacks2020
 * Author: Shaemus Melvin
 */

package CalgaryHacks2020;
import java.util.Scanner;

import GUI.StringFrame;


public class CalgaryHacks2020 {

    public static void main(String[] args) {
        StudentReader reader = new StudentReader();
        Student alice = reader.read(".\\src\\CalgaryHacks2020\\Students\\Alice.txt", ".\\src\\CalgaryHacks2020\\Students\\AliceSchedule.txt");
        Student bob = reader.read(".\\src\\CalgaryHacks2020\\Students\\Bob.txt", ".\\src\\CalgaryHacks2020\\Students\\BobSchedule.txt");
        Student charlie = reader.read(".\\src\\CalgaryHacks2020\\Students\\Charlie.txt", ".\\src\\CalgaryHacks2020\\Students\\CharlieSchedule.txt");
        Student darren = reader.read(".\\src\\CalgaryHacks2020\\Students\\Darren.txt", ".\\src\\CalgaryHacks2020\\Students\\DarrenSchedule.txt");
        Student evan = reader.read(".\\src\\CalgaryHacks2020\\Students\\Evan.txt", ".\\src\\CalgaryHacks2020\\Students\\EvanSchedule.txt");


		StringFrame stringFrame = new StringFrame();
		stringFrame.start();

        String name;
        String ucID;
        boolean exit = false;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter your name");
        name = kb.next();
        System.out.println("Please enter your ucID");
        ucID = kb.next();

        //TODO: build schedule based on UCID
        ScheduleBuilder myScheduleBuilder = new ScheduleBuilder();
        myScheduleBuilder.read(".\\src\\CalgaryHacks2020\\Students\\MyStudentSchedule.txt");
        Schedule studentSchedule = new Schedule();

        Student user = new Student(name, null, ucID);
        System.out.println(user.getName());

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

}
