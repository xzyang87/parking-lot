import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ParkingSeniorManagerTest {
    @Test
    public void ShouldParkTheCarInTheFirstParkingLotIfTheFirstParkingLotHasTheLargestVacancyRate() throws Exception {
        ParkingLot lot1 = new ParkingLot(10);
        ParkingLot lot2 = new ParkingLot(8);
        List<ParkingLot> parkingLots = Arrays.asList(lot1, lot2);

        lot1.park();
        lot2.park();

        ParkingSeniorManager seniorManager = new ParkingSeniorManager(parkingLots);
        seniorManager.park();
        Assert.assertEquals(lot1.getSpaces(), 8);
        Assert.assertEquals(lot2.getSpaces(), 7);
    }
}
