import java.util.ArrayList;

public class ConferenceRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> confGuest;


    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.confGuest = new ArrayList<Guest>();
    }

    public String getConferenceRoomName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int guestCount(){
        return this.confGuest.size();
    }


}
