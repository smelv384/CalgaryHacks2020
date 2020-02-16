/**
 * Made by the U of C-MRU Coalition for the Purpose of Victory in CalgaryHacks2020
 * Author: Shaemus Melvin
 */

package CalgaryHacks2020;

public class Event {
    private enum EventType {
        FREETIME, CLASS, STUDYING
    }

    private EventType eventType;
    Assignment optionalAssignment;

    public Event() {

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
