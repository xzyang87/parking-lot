import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MiddleParkingManagerTest {
    @Test
    public void ShouldParkTheCarInTheFirstParkingLotIfTheFirstParkingLotHasMoreAvailableSpaces() throws Exception {
        ParkingLot lot1 = new ParkingLot(5, "Alpha");
        ParkingLot lot2 = new ParkingLot(3, "Beta");
        List<ParkingLot> parkingLots = Arrays.asList(lot1, lot2);

        MiddleParkingManager middleManager = new MiddleParkingManager(parkingLots);
        middleManager.park();
        Assert.assertEquals(lot1.getSpaces(), 4);
        Assert.assertEquals(lot2.getSpaces(), 3);
    }

    @Test
    public void ShouldParkTheCarInTheSecondParkingLotIfTheSecondParkingLotHasMoreAvailableSpaces() throws Exception {
        ParkingLot lot1 = new ParkingLot(5, "Alpha");
        ParkingLot lot2 = new ParkingLot(6, "Beta");
        List<ParkingLot> parkingLots = Arrays.asList(lot1, lot2);

        MiddleParkingManager middleManager = new MiddleParkingManager(parkingLots);
        middleManager.park();
        Assert.assertEquals(lot1.getSpaces(), 5);
        Assert.assertEquals(lot2.getSpaces(), 5);
    }
}
