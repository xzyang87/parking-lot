import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingMiddleManagerTest {
    @Test
    public void ShouldParkTheCarInTheFirstParkingLotIfTheFirstParkingLotHasMoreAvailableSpaces() throws Exception {
        ParkingLot lot1 = new ParkingLot(5);
        ParkingLot lot2 = new ParkingLot(3);
        List<ParkingLot> parkingLots = Arrays.asList(lot1, lot2);

        ParkingMiddleManager middleManager = new ParkingMiddleManager(parkingLots);
        middleManager.park();
        Assert.assertEquals(lot1.getSpaces(), 4);
        Assert.assertEquals(lot2.getSpaces(), 3);
    }

    @Test
    public void ShouldParkTheCarInTheSecondParkingLotIfTheSecondParkingLotHasMoreAvailableSpaces() throws Exception {
        ParkingLot lot1 = new ParkingLot(5);
        ParkingLot lot2 = new ParkingLot(6);
        List<ParkingLot> parkingLots = Arrays.asList(lot1, lot2);

        ParkingMiddleManager middleManager = new ParkingMiddleManager(parkingLots);
        middleManager.park();
        Assert.assertEquals(lot1.getSpaces(), 5);
        Assert.assertEquals(lot2.getSpaces(), 5);
    }
}
