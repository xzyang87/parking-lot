import java.util.List;
import java.util.Optional;

public class ParkingBoy {
    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    private List<ParkingLot> parkingLotList;

    public ParkingBoy(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    public void park() throws Exception {
        Optional<ParkingLot> parkingLot = parkingLotList.stream().filter(x -> x.getSpaces() > 0).findFirst();
        if (parkingLot.isPresent()) {
            parkingLot.get().park();
        }
    }
}
