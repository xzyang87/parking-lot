import java.util.Comparator;
import java.util.List;

public class ParkingSeniorManager extends Manager {
    private List<ParkingLot> parkingLots;

    public ParkingSeniorManager(List<ParkingLot> parkingLots) {

        this.parkingLots = parkingLots;
    }

    public void park() throws Exception {
        if (parkingLots.size() > 0) {
            ParkingLot lotToPark = parkingLots.stream().max(Comparator.comparingDouble(ParkingLot::getCapacityRate)).get();
            lotToPark.park();
        }
    }
}
