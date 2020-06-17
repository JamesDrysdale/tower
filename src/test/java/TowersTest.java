import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TowersTest {

    private Towers towers;
    private Guest guest;

    @Before
    public void before(){
        towers = new Towers("Faulty Towers", 30);
        guest = new Guest("Dexter Sparks");
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

}


