package CalgaryHacks2020;

public class Assignment {

    //Setters should probably have their variables processed outside of the method so that
    //the program can integrate easily with a GUI

    private String name;
    private int[] dateTime; //Since dates and times are stored as 3-dimensional arrays, this is the index of a specific date and time
    private int hours;
    private String className;

    public Assignment(String name, int[] dateTime, int hours, String className) {
        this.className = name;
        this.dateTime = dateTime;
        this.hours = hours;
        this.className = className;
    }

	public void setName(String name) {
		this.name = name;
	}

	//This receives 3 integers rather than an array because we figured it'd be easier
	public void setDate(int week, int day, int hour) {
		dateTime = new int[] { week, day, hour };
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getName() {
	    return name;
	}

	public int[] getDate() {
	    return dateTime;
	}

	public int getHours() {
	    return hours;
	}

	public String getClassName() {
	    return className;
	}
}
