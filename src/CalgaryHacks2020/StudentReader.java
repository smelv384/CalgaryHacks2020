/**
 * Made by the U of C-MRU Coalition for the Purpose of Victory in CalgaryHacks2020
 * Author: Shaemus Melvin
 */

package CalgaryHacks2020;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class StudentReader {

    public static Student read(String fileName, String scheduleFileName) throws FileNotFoundException {
        File inFile = new File(fileName);
        Scanner in = new Scanner(inFile);

        String studentName = in.nextLine();
        Schedule studentSchedule;
        studentSchedule = ScheduleBuilder.read(scheduleFileName);
        String studentUcID = in.nextLine();

        Student newStudent = new Student(studentName, studentSchedule, studentUcID);
        in.close();
        return newStudent;
    }
}
