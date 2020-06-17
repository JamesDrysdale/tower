import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom("The Royal Suite"/*, 22, 2*/);
    }

    @Test
    public void roomHasName() {
        assertEquals("The Royal Suite", bedroom.getBedroomName());
    }

}

