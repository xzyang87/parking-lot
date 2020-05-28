import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SuperParkingManagerTest {

    @Test
    public void ShouldPartToOwnLot() throws Exception {
        ParkingLot ownLot = new ParkingLot(5, "Alfa");
        ParkingLot seniorManagerLot = new ParkingLot(5, "Bravo");
        SeniorParkingManager seniorManager = new SeniorParkingManager(Arrays.asList(seniorManagerLot));
        SuperParkingManager superManager = new SuperParkingManager(ownLot, Arrays.asList(seniorManager));

        superManager.park();

        Assert.assertEquals(4, ownLot.getSpaces());
        Assert.assertEquals(5, seniorManagerLot.getSpaces());
    }

    @Test
    public void ShouldParkToSubordinateManagerParkingLot() throws Exception {
        ParkingLot ownLot = new ParkingLot(5, "Alfa");
        ParkingLot seniorManagerLot = new ParkingLot(5, "Bravo");
        SeniorParkingManager seniorManager = new SeniorParkingManager(Arrays.asList(seniorManagerLot));
        SuperParkingManager superManager = new SuperParkingManager(ownLot, Arrays.asList(seniorManager));

        superManager.delegate(seniorManager);

        Assert.assertEquals(5, ownLot.getSpaces());
        Assert.assertEquals(4, seniorManagerLot.getSpaces());
    }

    @Test
    public void ShouldNotParkToNonSubordinateParkingLot() throws Exception {
        ParkingLot ownLot = new ParkingLot(5, "Alfa");
        ParkingLot subordinateManagerLot = new ParkingLot(5, "Bravo");
        ParkingLot nonSubordinateManagerLot = new ParkingLot(5, "Charlie");
        SeniorParkingManager seniorManager = new SeniorParkingManager(Arrays.asList(subordinateManagerLot));
        SeniorParkingManager otherManager = new SeniorParkingManager(Arrays.asList(nonSubordinateManagerLot));

        SuperParkingManager superManager = new SuperParkingManager(ownLot, Arrays.asList(seniorManager));

        superManager.delegate(otherManager);

        Assert.assertEquals(5, ownLot.getSpaces());
        Assert.assertEquals(5, subordinateManagerLot.getSpaces());
        Assert.assertEquals(5, nonSubordinateManagerLot.getSpaces());
    }

    @Test
    public void ShouldPrintParkingLotInfoManagedBySelfAndSubordinateManagers() throws Exception {
        ParkingLot lot1 = new ParkingLot(5, "Alfa");
        ParkingLot lot2 = new ParkingLot(2, "Bravo");
        ParkingLot lot3 = new ParkingLot(3, "Charlie");
        ParkingLot lot4 = new ParkingLot(8, "Delta");
        ParkingLot lot5 = new ParkingLot(4, "Echo");
        ParkingLot lot6 = new ParkingLot(9, "Foxtrot");
        ParkingLot lot7 = new ParkingLot(4, "Golf");
        ParkingLot lot8 = new ParkingLot(12, "Hotel");
        ParkingLot lot9 = new ParkingLot(3, "India");
        ParkingLot lot10 = new ParkingLot(30, "Juliett");

        lot1.park();
        lot1.park();
        lot2.park();
        lot3.park();
        lot4.park();
        lot4.park();
        lot4.park();
        lot5.park();
        lot5.park();
        lot6.park();
        lot8.park();
        lot8.park();
        lot8.park();
        lot9.park();
        lot10.park();
        lot10.park();
        lot10.park();
        lot10.park();
        lot10.park();

        JuniorParkingManager juniorManager = new JuniorParkingManager(Arrays.asList(lot1, lot2));
        MiddleParkingManager middleManager = new MiddleParkingManager(Arrays.asList(lot3, lot4, lot5));
        SeniorParkingManager seniorManager = new SeniorParkingManager(Arrays.asList(lot6, lot7, lot8, lot9));

        SuperParkingManager superManager = new SuperParkingManager(lot10, Arrays.asList(juniorManager, middleManager, seniorManager));
        String info = superManager.printParkingLotsInfo();
        Assert.assertEquals(info, "name: Juliett, capacity: 30, vacancy: 25, occupancy rate: 16.67%\n" +
                "name: Alfa, capacity: 5, vacancy: 3, occupancy rate: 40.00%\n" +
                "name: Bravo, capacity: 2, vacancy: 1, occupancy rate: 50.00%\n" +
                "name: Charlie, capacity: 3, vacancy: 2, occupancy rate: 33.33%\n" +
                "name: Delta, capacity: 8, vacancy: 5, occupancy rate: 37.50%\n" +
                "name: Echo, capacity: 4, vacancy: 2, occupancy rate: 50.00%\n" +
                "name: Foxtrot, capacity: 9, vacancy: 8, occupancy rate: 11.11%\n" +
                "name: Golf, capacity: 4, vacancy: 4, occupancy rate: 0.00%\n" +
                "name: Hotel, capacity: 12, vacancy: 9, occupancy rate: 25.00%\n" +
                "name: India, capacity: 3, vacancy: 2, occupancy rate: 33.33%\n");
    }
}
