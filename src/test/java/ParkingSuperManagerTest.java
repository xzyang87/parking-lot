import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ParkingSuperManagerTest {

//    @Test
//    public void ShouldPartToOwnLot() throws Exception {
//        ParkingLot ownLot = new ParkingLot(5);
//        ParkingLot seniorManagerLot = new ParkingLot(5);
//        SeniorParkingManager seniorManager = new SeniorParkingManager(Arrays.asList(seniorManagerLot));
//        ParkingSuperManager superManager = new ParkingSuperManager(ownLot, Arrays.asList(seniorManager));
//
//        superManager.parkToOwnLot();
//
//        Assert.assertEquals(4, ownLot.getSpaces());
//        Assert.assertEquals(5, seniorManagerLot.getSpaces());
//    }

//    @Test
//    public void ShouldParkToOtherParkingManagerLot() throws Exception {
//        ParkingLot ownLot = new ParkingLot(5);
//        ParkingLot seniorManagerLot = new ParkingLot(5);
//        SeniorParkingManager seniorManager = new SeniorParkingManager(Arrays.asList(seniorManagerLot));
//        ParkingSuperManager superManager = new ParkingSuperManager(ownLot, Arrays.asList(seniorManager));
//
//        superManager.delegate(seniorManager);
//
//        Assert.assertEquals(5, ownLot.getSpaces());
//        Assert.assertEquals(4, seniorManagerLot.getSpaces());
//    }

//    @Test
//    public void ShouldNotParkToOtherParkingManagerLotIfManagerDoNotBelongToManagedManagers() throws Exception {
//        ParkingLot ownLot = new ParkingLot(5);
//        ParkingLot seniorManagerLot = new ParkingLot(5);
//        SeniorParkingManager seniorManager = new SeniorParkingManager(Arrays.asList(seniorManagerLot));
//        SeniorParkingManager otherManager = new SeniorParkingManager(Arrays.asList(seniorManagerLot));
//
//        ParkingSuperManager superManager = new ParkingSuperManager(ownLot, Arrays.asList(seniorManager));
//
//        superManager.delegate(otherManager);
//
//        Assert.assertEquals(5, ownLot.getSpaces());
//        Assert.assertEquals(5, seniorManagerLot.getSpaces());
//    }

//    @Test
//    public void ShouldPrintSubordinateManagersNamesAndParkingLotInfoOwnedBySubordinates() {
//        ParkingLot subordinateLot1 = new ParkingLot(2);
//        ParkingLot subordinateLot2 = new ParkingLot(3);
//        ParkingLot subordinateLot3 = new ParkingLot(3);
//
//        ParkingSenior
//    }
}
