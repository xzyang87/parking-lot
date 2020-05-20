import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {

    @Test
    public void ShouldAddACarToParkingLotWhenAvailable() throws Exception {
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.park();
        int spaces = parkingLot.getSpaces();
        Assert.assertEquals(spaces, 9);
    }

    @Test(expected = Exception.class)
    public void ShouldNotAddACarToParkingLotWhenNotAvailable() throws Exception {
        ParkingLot parkingLot = new ParkingLot(0);
        parkingLot.park();
    }

    @Test
    public void ShouldRetrieveACarFromParkingLot() throws Exception {
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.retrieve();
        int spaces = parkingLot.getSpaces();
        Assert.assertEquals(spaces, 8);
    }

    @Test(expected = Exception.class)
    public void ShouldNotRetrieveACarFromParkingLotWhenNoCarParked() throws Exception {
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.retrieve();
    }
}