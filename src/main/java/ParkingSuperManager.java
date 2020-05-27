import java.util.List;

public class ParkingSuperManager {
    private ParkingLot lot;
    private List<Manager> managers;

    public <T> ParkingSuperManager(ParkingLot lot, List<Manager> managers) {
        this.lot = lot;
        this.managers = managers;
    }

    public void parkToOwnLot() throws Exception {
        lot.park();
    }

    public void delegate(Manager manager) throws Exception {
        if (managers.contains(manager)) {
            manager.park();
        }
    }
}
