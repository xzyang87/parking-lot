public class ParkingLot {

    private int spaces;
    private int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.spaces = capacity;
    }

    public void park() throws Exception {
        if(this.spaces <= 0) {
            throw new Exception("no spaces left");
        }
        this.spaces--;
    }

    public int getSpaces() {
        return spaces;
    }

    public double getCapacityRate() {
        return (double)spaces / (double)capacity;
    }

    public void retrieve() throws Exception{
        if (this.spaces == this.capacity) {
            throw new Exception("No car in the parking lot");
        }
        this.spaces++;
    }
}
