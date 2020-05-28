import java.util.Comparator;
import java.util.List;

public class SeniorParkingManager extends ParkingManager {
    public SeniorParkingManager(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    public void park() throws Exception {
        List<ParkingLot> parkingLots = managedParkingLots();
        if (parkingLots.size() > 0) {
            ParkingLot lotToPark = parkingLots.stream().max(Comparator.comparingDouble(ParkingLot::getCapacityRate)).get();
            lotToPark.park();
        }
    }
}
