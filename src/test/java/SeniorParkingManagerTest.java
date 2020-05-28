import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SeniorParkingManagerTest {
    @Test
    public void ShouldParkTheCarInTheFirstParkingLotIfTheFirstParkingLotHasTheLargestVacancyRate() throws Exception {
        ParkingLot lot1 = new ParkingLot(5, "Alfa");
        ParkingLot lot2 = new ParkingLot(2, "Bravo");
        List<ParkingLot> parkingLots = Arrays.asList(lot1, lot2);
        // lot1 left: 2, capacityRate: 0.4
        lot1.park();
        lot1.park();
        lot1.park();
        // lot2 left: 1, capacityRate: 0.5
        lot2.park();

        SeniorParkingManager seniorManager = new SeniorParkingManager(parkingLots);
        seniorManager.park();

        // should part to lot2
        Assert.assertEquals(2, lot1.getSpaces());
        Assert.assertEquals(0, lot2.getSpaces());
    }

    @Test
    public void ShouldParkTheCarInTheSecondParkingLotIfTheSecondParkingLotHasTheLargestVacancyRate() throws Exception {
        ParkingLot lot1 = new ParkingLot(5, "Alfa");
        ParkingLot lot2 = new ParkingLot(2, "Bravo");
        List<ParkingLot> parkingLots = Arrays.asList(lot1, lot2);
        // lot1 left: 3, capacityRate: 0.6
        lot1.park();
        lot1.park();
        // lot2 left: 1, capacityRate: 0.5
        lot2.park();

        SeniorParkingManager seniorManager = new SeniorParkingManager(parkingLots);
        seniorManager.park();

        // should part to lot1
        Assert.assertEquals(2, lot1.getSpaces());
        Assert.assertEquals(1, lot2.getSpaces());
    }
}
