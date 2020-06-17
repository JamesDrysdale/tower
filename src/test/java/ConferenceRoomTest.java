import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    
    private ConferenceRoom conferenceRoom;
    
    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Conference Room 1");
    }
    
    @Test
    public void conferenceRoomHasName(){
        assertEquals("Conference Room 1", conferenceRoom.getConferenceRoomName());
    }


    // We can uncomment and run these one at a time

    /*

    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(5, conferenceRoom.getCapacity());
    }

     */




}


