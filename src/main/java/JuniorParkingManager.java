import java.util.List;

public class JuniorParkingManager extends ParkingManager {
    public JuniorParkingManager(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }
//    public List<ParkingLot> getParkingLotList() {
//        return parkingLotList;
//    }

//    private List<ParkingLot> parkingLotList;

//    public JuniorParkingManager(List<ParkingLot> parkingLotList) {
//        this.parkingLotList = parkingLotList;
//    }

//    private override JuniorParkingManager() {
//
//    }


//    public void park() throws Exception {
//        Optional<ParkingLot> parkingLot = parkingLotList.stream().filter(x -> x.getSpaces() > 0).findFirst();
//        if (parkingLot.isPresent()) {
//            parkingLot.get().park();
//        }
//    }
}
