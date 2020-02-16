/**
 * Made by the U of C-MRU Coalition for the Purpose of Victory in CalgaryHacks2020
 * Author: Shaemus Melvin
 */

package CalgaryHacks2020;

public class Event {
    private enum EventType {
        FREETIME, CLASS, STUDYING
    }

    private String className;
    private EventType eventType;
    Assignment optionalAssignment;

    public Event() {

    }

    public String getClassName() {
        return className;
    }

    public String getEventType() {
        return eventType.toString();
    }

    public Assignment getOptionalAssignment() {
        return optionalAssignment;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setOptionalAssignment(Assignment optionalAssignment) {
        this.optionalAssignment = optionalAssignment;
    }

    public void setEventType(int eventInt) {
        switch (eventInt) {
            case 0:
                eventType = EventType.FREETIME;
                break;
            case 1:
                eventType = EventType.CLASS;
                break;
            case 2:
                eventType = EventType.STUDYING;
                break;
        }
    }

}
