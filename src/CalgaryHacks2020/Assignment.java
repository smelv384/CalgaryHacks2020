package CalgaryHacks2020;

public class Assignment {

    //Setters should probably have their variables processed outside of the method so that
    //the program can integrate easily with a GUI

    private String name;
    private int[] date;
    private int hours;
    private String className;

    public Assignment() {
        //Should figure this out at some point
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(int week, int day, int hour) {
		date = new int[] { week, day, hour };
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getName() {
	    return name;
	}

	public int[] getDate() {
	    return date;
	}

	public int getHours() {
	    return hours;
	}

	public String getClassName() {
	    return className;
	}
}
