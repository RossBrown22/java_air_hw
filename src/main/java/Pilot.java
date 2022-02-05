public class Pilot extends Person{

    private int licenceNumber;
    private Rank rank;

    public Pilot(String name, Rank rank, int licenceNumber){
        super(name);
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String flyPlane(){
        return "We have lift off!";
    }
}
