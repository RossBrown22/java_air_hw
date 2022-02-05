public enum PlaneType {

    BOEING747(10, 100),
    AIRBUSA330(15, 150),
    BOEING777(20, 200);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
