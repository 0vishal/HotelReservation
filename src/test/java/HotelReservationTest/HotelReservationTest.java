package HotelReservationTest;

import HotelReservation.HotelReservation;
import HotelReservation.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {

    HotelReservationSystem hotelsystem;

    @BeforeAll
    public void execute() {
        hotelsystem = new HotelReservationSystem();

    }

    @Test
    public void AddHotel(String lakewood) {
        hotelsystem.AddHotel("Lakewood");
        hotelsystem.AddHotel("Bridgewood");
        hotelsystem.AddHotel("Ridgewood");
    }

    @Test
    public void Adddetail() {
        HotelReservation lakewood = new HotelReservation("Lakewood", 100, 3);
        HotelReservation Bridgewood = new HotelReservation("Bridgewood", 200, 4);
        HotelReservation Ridgewood = new HotelReservation("Ridgewood", 300, 5);

    }

    @Test
    public void Testdata() {
        Assertions.assertEquals("Lakewood","Lakewood");
        Assertions.assertEquals("Bridgewood","Bridgewood");
        Assertions.assertEquals("Ridgewood","Ridgewood");

    }
}
