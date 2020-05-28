import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ParkingManager {
    private List<ParkingLot> parkingLots;

    private ParkingManager() { }

    public ParkingManager(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public List<ParkingLot> managedParkingLots() {
        return parkingLots;
    }

    public void park() throws Exception {
        Optional<ParkingLot> parkingLot = parkingLots.stream().filter(x -> x.getSpaces() > 0).findFirst();
        if (parkingLot.isPresent()) {
            parkingLot.get().park();
        }
    }
}
