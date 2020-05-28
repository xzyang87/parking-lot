import java.util.List;

public class SuperParkingManager {
    private ParkingLot lot;
    private List<ParkingManager> subordinates;

    public <T> SuperParkingManager(ParkingLot lot, List<ParkingManager> managers) {
        this.lot = lot;
        this.subordinates = managers;
    }

    public void park() throws Exception {
        lot.park();
    }

    public void delegate(ParkingManager manager) throws Exception {
        if (subordinates.contains(manager)) {
            manager.park();
        }
    }
}
