package CalgaryHacks2020;

public class Schedule {

	private Event[13][7][24] tempSchedule;
	
	

	public Schedule() {
	    Event[13][7][24] tempSchedule = new Event[13][7][24]();
	    for (int i = 0; i < 13; i++) {
	        for (int j = 0; j < 7; j++) {
	            for (int k = 0; k < 24; k++) {
	                tempSchedule[i][j][k] = null;
	            }
	        }
	    }

	}

}
