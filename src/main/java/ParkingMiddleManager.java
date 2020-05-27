import java.util.Comparator;
import java.util.List;

public class ParkingMiddleManager extends Manager {
    private List<ParkingLot> parkingLots;

    public ParkingMiddleManager(List<ParkingLot> parkingLots) {

        this.parkingLots = parkingLots;
    }

    public void park() throws Exception {
        if (parkingLots.size() > 0) {
             ParkingLot lotToPark = parkingLots.stream().max(Comparator.comparingInt(ParkingLot::getSpaces)).get();
             lotToPark.park();
        }
    }
}
