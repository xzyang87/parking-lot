import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JuniorParkingManagerTest {
    @Test
    public void ShouldParkTheCarInTheFirstParkingLotIfAvailable() throws Exception {
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot(2));
        parkingLots.add(new ParkingLot(2));
        JuniorParkingManager juniorManager = new JuniorParkingManager(parkingLots);
        juniorManager.park();
        Assert.assertEquals(juniorManager.managedParkingLots().get(0).getSpaces(), 1);
        Assert.assertEquals(juniorManager.managedParkingLots().get(1).getSpaces(), 2);
    }

    @Test
    public void ShouldParkTheCarInTheSecondParkingLotIfTheFirstParkingLotIsUnavailable() throws Exception {
        List<ParkingLot> parkingLotList = new ArrayList<>();
        parkingLotList.add(new ParkingLot(2));
        parkingLotList.add(new ParkingLot(2));
        JuniorParkingManager juniorManager = new JuniorParkingManager(parkingLotList);
        juniorManager.park();
        juniorManager.park();
        juniorManager.park();
        Assert.assertEquals(juniorManager.managedParkingLots().get(0).getSpaces(), 0);
        Assert.assertEquals(juniorManager.managedParkingLots().get(1).getSpaces(), 1);
    }
}