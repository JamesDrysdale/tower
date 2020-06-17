import java.util.ArrayList;

public class Bedroom {

    private String name;
    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guestList;

    public Bedroom(String name, int roomNumber, int capacity, String type){
        this.name = name;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guestList = new ArrayList<Guest>();
    }

    public String getBedroomName(){
        return this.name;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int guestCount(){
        return this.guestList.size();
    }

    public String getBedroomType(){
        return this.type;
    }

        public void addGuestToBedroom(Guest guestList){
        if(this.guestCount() < this.capacity)
            this.guestList.add(guestList);
        }


}
