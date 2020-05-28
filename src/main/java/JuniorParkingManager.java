import java.util.List;
import java.util.Optional;

public class ParkingJuniorManager implements ParkingManager {
    private List<ParkingLot> parkingLots;
//    public List<ParkingLot> getParkingLotList() {
//        return parkingLotList;
//    }

//    private List<ParkingLot> parkingLotList;

//    public ParkingJuniorManager(List<ParkingLot> parkingLotList) {
//        this.parkingLotList = parkingLotList;
//    }

//    private override ParkingJuniorManager() {
//
//    }

    @Override
    public ParkingManager Init(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
        return null;
    }

    public void park() throws Exception {
        Optional<ParkingLot> parkingLot = parkingLotList.stream().filter(x -> x.getSpaces() > 0).findFirst();
        if (parkingLot.isPresent()) {
            parkingLot.get().park();
        }
    }
}
