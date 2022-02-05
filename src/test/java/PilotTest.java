import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Craig", Rank.CAPTAIN, 12345);
    }

    @Test
    public void canGetName(){
        assertEquals("Craig", pilot.getName());
    }

    @Test
    public void canSetName(){
        pilot.setName("Stan");
        assertEquals("Stan", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canSetRank(){
        pilot.setRank(Rank.FIRSTOFFICER);
        assertEquals(Rank.FIRSTOFFICER, pilot.getRank());
    }

    @Test
    public void canGetLicenceNumber(){
        assertEquals(12345, pilot.getLicenceNumber());
    }

    @Test
    public void canSetLicence(){
        pilot.setLicenceNumber(678910);
        assertEquals(678910, pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("We have lift off!", pilot.flyPlane());
    }
}
