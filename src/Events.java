public class ConferenceEvent {
    private int eventID;
    private String eventName;mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
    private String eventLocation;
    private String pointOfContact;
    private CalculateEventCostClass calculateEventCostObject;

    public ConferenceEvent() {
        calculateEventCostObject = new CalculateEventCostClass();
    }

    public double calculateEventCost() {
        return calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.3);
    }
}

public class MusicEvent {
    private int eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private CalculateEventCostClass calculateEventCostObject;

    public MusicEvent() {
        calculateEventCostObject = new CalculateEventCostClass();
    }

    public double calculateEventCost() {
        return calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.2);
    }
}

public class PastEvents {
    private int eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
}