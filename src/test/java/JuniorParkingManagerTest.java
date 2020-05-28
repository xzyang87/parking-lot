import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ParkingJuniorManagerTest {
    @Test
    public void ShouldParkTheCarInTheFirstParkingLotIfAvailable() throws Exception {
        List<ParkingLot> parkingLotList = new ArrayList<>();
        parkingLotList.add(new ParkingLot(2));
        parkingLotList.add(new ParkingLot(2));
        new JuniorParkingManager.
        ParkingJuniorManager boy = new JuniorParkingManager(parkingLotList);
        boy.park();
        Assert.assertEquals(boy.getParkingLotList().get(0).getSpaces(), 1);
        Assert.assertEquals(boy.getParkingLotList().get(1).getSpaces(), 2);
    }

    @Test
    public void ShouldParkTheCarInTheSecondParkingLotIfTheFirstParkingLotIsUnavailable() throws Exception {
        List<ParkingLot> parkingLotList = new ArrayList<>();
        parkingLotList.add(new ParkingLot(2));
        parkingLotList.add(new ParkingLot(2));
        JuniorParkingManager boy = new JuniorParkingManager(parkingLotList);
        boy.park();
        boy.park();
        boy.park();
        Assert.assertEquals(boy.getParkingLotList().get(0).getSpaces(), 0);
        Assert.assertEquals(boy.getParkingLotList().get(1).getSpaces(), 1);
    }
}