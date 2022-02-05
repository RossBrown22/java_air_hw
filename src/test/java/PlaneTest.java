import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private PlaneType planeType;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canSetPlaneType(){
        plane.setPlaneType(PlaneType.AIRBUSA330);
        assertEquals(PlaneType.AIRBUSA330, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10, PlaneType.BOEING747.getCapacity());
    }

    @Test
    public void canGetWeight(){
       assertEquals(100, PlaneType.BOEING747.getWeight());
    }
}
