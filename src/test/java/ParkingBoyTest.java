import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoyTest {
    @Test
    public void ShouldParkTheCarInTheFirstParkingLotIfAvailable() throws Exception {
        List<ParkingLot> parkingLotList = new ArrayList<ParkingLot>();
        parkingLotList.add(new ParkingLot(2));
        parkingLotList.add(new ParkingLot(2));
        ParkingBoy boy = new ParkingBoy(parkingLotList);
        boy.park();
        Assert.assertEquals(boy.getParkingLotList().get(0).getSpaces(), 1);
        Assert.assertEquals(boy.getParkingLotList().get(1).getSpaces(), 2);
    }

}