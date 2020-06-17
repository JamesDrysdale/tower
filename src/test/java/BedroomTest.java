import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom("The Royal Suite", 22, 2, "single");
        bedroom2 = new Bedroom("Presidential Suite", 420, 4, "double");

        guest = new Guest("Jessica");
    }

    @Test
    public void roomHasName() {
        assertEquals("The Royal Suite", bedroom.getBedroomName());
    }

    @Test
    public void roomHasType() {
        assertEquals("double", bedroom2.getBedroomType());
    }

    @Test
    public void roomHasNumber(){
        assertEquals(22, bedroom.getRoomNumber());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void emptyBedroomHasNoGuests(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canAddGuestToBedroom(){
        bedroom.addGuestToBedroom(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void cantAddGuestToFullRoom(){
        bedroom.addGuestToBedroom(guest);
        bedroom.addGuestToBedroom(guest);
        bedroom.addGuestToBedroom(guest);
        assertEquals(2, bedroom.guestCount());
    }


}

