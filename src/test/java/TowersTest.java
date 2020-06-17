import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TowersTest {

    private Towers towers;
    private Guest guest;
    private  Bedroom bedroom;

    @Before
    public void before(){
        towers = new Towers("Faulty Towers", 30);
        guest = new Guest("Dexter Sparks");
        bedroom = new Bedroom("Room1", 420, 10, "double");
    }

    @Test
    public void towersHasName(){
        assertEquals("Faulty Towers", towers.getName());
    }

    @Test
    public void towerCapacity(){
        assertEquals(30 , towers.getCapacity());
    }

    @Test
    public void towerGuestCount(){
        towers.addGuest(guest);
        assertEquals(1, towers.guestCount());
    }

    @Test
    public void removeGuestFromTower(){
        towers.addGuest(guest);
        towers.addGuest(guest);
        towers.removeGuest(guest);
        assertEquals(1, towers.guestCount());
    }

    @Test
    public void addGuestToBedroom(){
        towers.addBedroom(bedroom);
        towers.addGuest(guest);
        assertEquals(1, towers.guestCount());
    }

}


