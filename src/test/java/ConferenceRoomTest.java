import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    
    private ConferenceRoom conferenceRoom;
    
    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Conference Room 1", 5);
    }
    
    @Test
    public void conferenceRoomHasName(){
        assertEquals("Conference Room 1", conferenceRoom.getConferenceRoomName());
    }

    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(5, conferenceRoom.getCapacity());
    }





}


