/**
 * Main class for the CalgaryHacks2020 hackathon, by the U of C-MRU Coalition for the Purpose of Victory in CalgaryHacks2020
 * Author: Shaemus Melvin
 */

package CalgaryHacks2020;
import java.util.Scanner;


public class CalgaryHacks2020 {

    public static void main(String[] args) {
        String name;
        String ucID;
        boolean exit = false;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter your name");
        name = kb.next();
        System.out.println("Please enter your ucID");
        ucID = kb.next();

        //TODO: build schedule based on UCID
        Schedule studentSchedule = new Schedule();

        Student user = new Student(name, null, ucID);
        System.out.println(user.getName());

        while (!exit) {
            System.out.println("What would you like to do?\n"
                    + "Add collaboration request\n"
                    + "View collaboration requests\n");
        }

        kb.close();




    }

}
