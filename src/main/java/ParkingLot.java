public class ParkingLot {

    private int spaces;
    private int capacity;
    private String name;

    public ParkingLot(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        this.spaces = capacity;
    }

    public void park() throws Exception {
        if(this.spaces <= 0) {
            throw new Exception("no spaces left");
        }
        this.spaces--;
    }

    public String getName() {
        return name;
    }

    public int getSpaces() {
        return spaces;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getVacancyRate() {
        return (double)spaces / (double)capacity;
    }

    public double getOccupancyRate() {
        return 1 - getVacancyRate();
    }

    public void retrieve() throws Exception{
        if (this.spaces == this.capacity) {
            throw new Exception("No car in the parking lot");
        }
        this.spaces++;
    }
}
