import java.io.Console;
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

    public String printParkingLotsInfo() {
        String info = "";
        if (lot != null) {
            // print self-managed parking lot info
            info += lot.getInfo();
        }

        final String[] subordinateInfo = {""};
        if (subordinates != null && subordinates.size() > 0) {
            // print subordinates-managed parking lot info
            subordinates.forEach(manager -> manager.managedParkingLots().forEach(lot -> subordinateInfo[0] += lot.getInfo()));
        }
        String finalInfo = info + subordinateInfo[0];
        System.out.println(finalInfo);
        return finalInfo;
    }
}
