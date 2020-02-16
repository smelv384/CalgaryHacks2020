package CalgaryHacks2020;

import java.util.Set;

public class Schedule {

	private Event[][][] tempSchedule = new Event[13][7][24];
	private Set<String> classSet;

	//Constructor sets all events to free time by default, can be reset later
	public Schedule() {
	    for (int i = 0; i < 13; i++) {
	        for (int j = 0; j < 7; j++) {
	            for (int k = 0; k < 24; k++) {
	                tempSchedule[i][j][k].setEventType(0);
	            }
	        }
	    }

	}

	public Event[][][] getTempSchedule() {
		return tempSchedule;
	}
	public void setTempSchedule(Event[][][] newTempSchedule) {
		this.tempSchedule = newTempSchedule;
	}

	public Set<String> getClassSet() {
		return classSet;
	}

	public void setClassSet(Set<String> classSet) {
		this.classSet = classSet;
	}

	public void addClass(String className) {
	    classSet.add(className);
	}

}
