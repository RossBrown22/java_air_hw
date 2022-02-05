import java.util.ArrayList;

public class Flight {

    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Plane plane;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;

    public Flight(int flightNumber, String destination, String departureAirport, String departureTime, Plane plane, Pilot pilot, ArrayList<CabinCrewMember> cabinCrew, ArrayList<Passenger> passengers){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = plane;
        this.pilot = pilot;
        this.cabinCrew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

//    public int checkSeats(){
//        return this.plane.getPlaneType().getCapacity();
//    }

    public void bookPassenger(Passenger passenger){
        if (this.getPassengers().size() < this.plane.getPlaneType().getCapacity()){
            this.passengers.add(passenger);
        }
    }
}
