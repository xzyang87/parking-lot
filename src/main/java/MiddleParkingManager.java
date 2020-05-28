import java.util.Comparator;
import java.util.List;

public class MiddleParkingManager extends ParkingManager {
    public MiddleParkingManager(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    public void park() throws Exception {
        List<ParkingLot> parkingLots = managedParkingLots();
        if (parkingLots.size() > 0) {
            ParkingLot lotToPark = parkingLots.stream().max(Comparator.comparingInt(ParkingLot::getSpaces)).get();
            lotToPark.park();
        }
    }
}
