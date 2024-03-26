package prog2.spring2024.exercise2;

public class Main {
    public static void main(String[] args) {
        ConferenceEvent conferenceEvent = new ConferenceEvent();
        System.out.println("Conference Event Cost: $" + conferenceEvent.calculateEventCost());

        MusicEvent musicEvent = new MusicEvent();
        System.out.println("Music Event Cost: $" + musicEvent.calculateEventCost());
    }
}
    
}
