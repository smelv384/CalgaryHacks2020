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

        Student user = new Student(name, null, ucID);
        System.out.println(user.getName());

        while (!exit) {

        }

        kb.close();




    }

}
