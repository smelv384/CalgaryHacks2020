package CalgaryHacks2020;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Made by the U of C-MRU Coalition for the Purpose of Victory in CalgaryHacks2020
 * @author samuel osweiler, Shaemus Melvin
 *
 */
public class ScheduleBuilder {


    public static Schedule read(String fileName) throws FileNotFoundException {
        File inFile = new File(fileName);
        Scanner in = new Scanner(inFile);

        Schedule studSchedule = new Schedule();

        while (in.hasNext()) {
            String allInfo = in.nextLine();
            String[] classParts = allInfo.split(" ", -1);
            String className = classParts[0];
            studSchedule.addClass(className);

            int dayIndex = 0;

            switch (classParts[1]) {
                case "mon":
                    dayIndex = 1;
                    break;
                case "tue":
                    dayIndex = 2;
                    break;
                case "wed":
                    dayIndex = 3;
                    break;
                case "thu":
                    dayIndex = 4;
                    break;
                case "fri":
                    dayIndex = 5;
                    break;
            }

            String startTime = classParts[2];
            int startInd = ( ( ( Integer.parseInt(startTime.split(":")[0]) + 16 ) % 12 ) * 2 ) +

                    ( ( Integer.parseInt(startTime.split(":")[1]) / 30));


            String endTime = classParts[3];
            int endInd = ( ( ( Integer.parseInt(endTime.split(":")[0]) + 16 ) % 12 ) * 2 ) +
                    ( ( Integer.parseInt(endTime.split(":")[1]) / 30));

            for (int i = 0; i < 13; i++) {
                for (int j = startInd; j < endInd; j++) {
                    studSchedule.getTempSchedule()[i][dayIndex][j].setEventType(1);
                    studSchedule.getTempSchedule()[i][dayIndex][j].setClassName(className);
                }
            }


        }



        in.close();
        return studSchedule;
    }
}
