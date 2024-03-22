public class Event {
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;

    public Event(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
    }

    public double calculateEventCost() {
        return eventCost;
    }

    @Override
    public String toString() {
        return "Event ID: " + eventID +
                "\nEvent Name: " + eventName +
                "\nEvent Location: " + eventLocation +
                "\nEvent Point of Contact: " + eventPointOfContact +
                "\nEvent Cost: $" + eventCost +
                "\nTotal Participants: " + totalParticipants +
                "\nTotal Event Days: " + totalEventDays;
    }
}

public class ConferenceEvent extends Event {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays,
                           boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost, boolean dinnerRequired, double dinnerCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    @Override
    public double calculateEventCost() {
        double totalCost = super.calculateEventCost();
        if (breakfastRequired) {
            totalCost += breakfastCost;
        }
        if (lunchRequired) {
            totalCost += lunchCost;
        }
        if (dinnerRequired) {
            totalCost += dinnerCost;
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBreakfast Required: " + breakfastRequired +
                "\nBreakfast Cost: $" + breakfastCost +
                "\nLunch Required: " + lunchRequired +
                "\nLunch Cost: $" + lunchCost +
                "\nDinner Required: " + dinnerRequired +
                "\nDinner Cost: $" + dinnerCost;
    }
}

public class MusicConcertEvent extends Event {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays,
                             boolean merchandiseRequired, double merchandiseCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    @Override
    public double calculateEventCost() {
        double totalCost = super.calculateEventCost();
        if (merchandiseRequired) {
            totalCost += merchandiseCost;
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMerchandise Required: " + merchandiseRequired +
                "\nMerchandise Cost: $" + merchandiseCost;
    }
}


