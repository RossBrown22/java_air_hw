import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Passenger passenger;
    private PlaneType planeType;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        pilot = new Pilot("Ross", Rank.CAPTAIN, 1234);
        cabinCrew = new ArrayList<CabinCrewMember>();
        passengers = new ArrayList<Passenger>();
        flight = new Flight(1, "GLA", "EDI", "10.00", plane, pilot, cabinCrew, passengers);
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals(1, flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("10.00", flight.getDepartureTime());
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void canGetCabinCrew(){
        assertEquals(cabinCrew, flight.getCabinCrew());
    }

    @Test
    public void canGetPassengers(){
        assertEquals(passengers, flight.getPassengers());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(10, plane.getPlaneType().getCapacity());
    }
}
