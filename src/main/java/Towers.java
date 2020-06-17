import java.util.ArrayList;

public class Towers {

    private String name;
    private int capacity;
    private ArrayList<Guest> allGuests;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Towers(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.allGuests = new ArrayList<Guest>();
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public String getName () {
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int guestCount(){
        return this.allGuests.size();
    }

    //Add guests to Hotel lobby
    public void addGuest(Guest allGuests){
        if (this.guestCount() < this.capacity) {
            this.allGuests.add(allGuests);
        }
    }



}

//        The Hotel will be able check guests in/out of rooms.
