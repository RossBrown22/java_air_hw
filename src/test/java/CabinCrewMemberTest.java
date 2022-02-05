import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Peter", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void canGetName(){
        assertEquals("Peter", cabinCrewMember.getName());
    }

    @Test
    public void canSetName(){
        cabinCrewMember.setName("Pedro");
        assertEquals("Pedro", cabinCrewMember.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.FLIGHTATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canSetRank(){
        cabinCrewMember.setRank(Rank.FIRSTOFFICER);
        assertEquals(Rank.FIRSTOFFICER, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Please remain seated", cabinCrewMember.relayMessage());
    }
}
