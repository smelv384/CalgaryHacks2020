package CalgaryHacks2020;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Assignment {
	
	public String setName() {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter the name of the assignment: ");
		String name = input.next();
		return name;	
	}
	
	public GregorianCalendar setDate() {
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
		
		return new GregorianCalendar(year, month, day, hour, minute);
	}
	
	public int setHours() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of hours you want to work: ");
		int hour = input.nextInt();
		return hour;
	}
	
	public String setClass() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the class: ");
		String className = input.next();
		return className;
	}
	
}
