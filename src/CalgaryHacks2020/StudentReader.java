/**
 * Made by the U of C-MRU Coalition for the Purpose of Victory in CalgaryHacks2020
 * Author: Shaemus Melvin
 */

package CalgaryHacks2020;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class StudentReader {

    public StudentReader() {
    }

    public Student read(String fileName, String scheduleFileName) {
        Scanner in = new Scanner(System.in);
        try {
            File inFile = new File(fileName);
            in = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            System.out.println("Fatal error");
        }
        String studentName = in.nextLine();
        Schedule studentSchedule;
        ScheduleBuilder studentScheduleBuilder = new ScheduleBuilder();
        studentSchedule = studentScheduleBuilder.read(scheduleFileName); //this is made assuming classical naming conventions for the builder method
        String studentUcID = in.nextLine();

        Student newStudent = new Student(studentName, studentSchedule, studentUcID);
        in.close();
        return newStudent;
    }
}
