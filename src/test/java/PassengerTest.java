import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Ross", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Ross", passenger.getName());
    }

    @Test
    public void canSetName(){
        passenger.setName("Alex");
        assertEquals("Alex", passenger.getName());
    }

    @Test
    public void canGetNumOfBags(){
        assertEquals(2, passenger.getNumOfBags());
    }

    @Test
    public void canSetNumOfBags(){
        passenger.setNumOfBags(3);
        assertEquals(3, passenger.getNumOfBags());
    }

}
