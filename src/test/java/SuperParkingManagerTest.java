import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SuperParkingManagerTest {

    @Test
    public void ShouldPartToOwnLot() throws Exception {
        ParkingLot ownLot = new ParkingLot(5);
        ParkingLot seniorManagerLot = new ParkingLot(5);
        SeniorParkingManager seniorManager = new SeniorParkingManager(Arrays.asList(seniorManagerLot));
        SuperParkingManager superManager = new SuperParkingManager(ownLot, Arrays.asList(seniorManager));

        superManager.park();

        Assert.assertEquals(4, ownLot.getSpaces());
        Assert.assertEquals(5, seniorManagerLot.getSpaces());
    }

    @Test
    public void ShouldParkToSubordinateManagerParkingLot() throws Exception {
        ParkingLot ownLot = new ParkingLot(5);
        ParkingLot seniorManagerLot = new ParkingLot(5);
        SeniorParkingManager seniorManager = new SeniorParkingManager(Arrays.asList(seniorManagerLot));
        SuperParkingManager superManager = new SuperParkingManager(ownLot, Arrays.asList(seniorManager));

        superManager.delegate(seniorManager);

        Assert.assertEquals(5, ownLot.getSpaces());
        Assert.assertEquals(4, seniorManagerLot.getSpaces());
    }

    @Test
    public void ShouldNotParkToNonSubordinateParkingLot() throws Exception {
        ParkingLot ownLot = new ParkingLot(5);
        ParkingLot subordinateManagerLot = new ParkingLot(5);
        ParkingLot nonSubordinateManagerLot = new ParkingLot(5);
        SeniorParkingManager seniorManager = new SeniorParkingManager(Arrays.asList(subordinateManagerLot));
        SeniorParkingManager otherManager = new SeniorParkingManager(Arrays.asList(nonSubordinateManagerLot));

        SuperParkingManager superManager = new SuperParkingManager(ownLot, Arrays.asList(seniorManager));

        superManager.delegate(otherManager);

        Assert.assertEquals(5, ownLot.getSpaces());
        Assert.assertEquals(5, subordinateManagerLot.getSpaces());
        Assert.assertEquals(5, nonSubordinateManagerLot.getSpaces());
    }

//    @Test
//    public void ShouldPrintSubordinateManagersNamesAndParkingLotInfoOwnedBySubordinates() {
//        ParkingLot subordinateLot1 = new ParkingLot(2);
//        ParkingLot subordinateLot2 = new ParkingLot(3);
//        ParkingLot subordinateLot3 = new ParkingLot(3);
//
//        ParkingSenior
//    }
}
