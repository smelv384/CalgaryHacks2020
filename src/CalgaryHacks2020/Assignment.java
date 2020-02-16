package CalgaryHacks2020;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Assignment {

    //Setters should probably have their variables processed outside of the method so that
    //the program can integrate easily with a GUI

    private String name;
    private GregorianCalendar date;
    private int hours;
    private String className;

	public void setName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the assignment: ");
		this.name = input.next();
		input.close();
	}

	public void setDate() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the due date.");
		System.out.print("Enter the due year: ");
		int year = input.nextInt();
		System.out.print("Enter the due month: ");
		int month = input.nextInt();
		System.out.print("Enter the due day: ");
		int day = input.nextInt();
		System.out.print("Enter the due hour: ");
		int hour = input.nextInt();
		System.out.print("Enter the due minute: ");
		int minute = input.nextInt();
		input.close();

		this.date = new GregorianCalendar(year, month, day, hour, minute);
	}

	public void setHours() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of hours you want to work: ");
		this.hours = input.nextInt();
		input.close();
	}

	public void setClassName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the class: ");
		this.className = input.next();
		input.close();
	}

	public String getName() {
	    return name;
	}

	public GregorianCalendar getDate() {
	    return date;
	}

	public int getHours() {
	    return hours;
	}

	public String getClassName() {
	    return className;
	}
}
