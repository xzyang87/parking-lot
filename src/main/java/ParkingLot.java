import static java.lang.Math.round;

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

    public int getSpaces() {
        return spaces;
    }

    private String OccupancyRate() {
        return String.format("%.2f", (1 - getVacancyRate()) * 100) + "%";
    }

    public void retrieve() throws Exception{
        if (this.spaces == this.capacity) {
            throw new Exception("No car in the parking lot");
        }
        this.spaces++;
    }


    public double getVacancyRate() {
        return (double)spaces / (double)capacity;
    }

    public String getInfo() {
        return "name: " + name + ", " +
                "capacity: " + capacity + ", " +
                "vacancy: " + spaces + ", " +
                "occupancy rate: " + OccupancyRate() + "\n";
    }
}
