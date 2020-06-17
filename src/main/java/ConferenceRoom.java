public class ConferenceRoom {
    private String name;
    private int capacity;


    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    public String getConferenceRoomName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }


}
