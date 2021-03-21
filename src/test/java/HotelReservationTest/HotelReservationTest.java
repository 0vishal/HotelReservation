package HotelReservationTest;

import HotelReservation.HotelReservation;
import HotelReservation.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class HotelReservationTest {

    HotelReservationSystem hotelsystem;

    @BeforeAll
    public void execute() {
        hotelsystem = new HotelReservationSystem();
        hotelsystem.AddHotel(lakewood);
        hotelsystem.AddHotel(Bridgewood);
        hotelsystem.AddHotel(Ridgewood);
    }

    HotelReservation lakewood = new HotelReservation("Lakewood", 100, 3);
    HotelReservation Bridgewood = new HotelReservation("Bridgewood", 200, 4);
    HotelReservation Ridgewood = new HotelReservation("Ridgewood", 300, 5);

    @Test
    public void TestData() {
        Assertions.assertEquals("Lakewood", "Lakewood");
        Assertions.assertEquals("Bridgewood", "Bridgewood");
        Assertions.assertEquals("Ridgewood", "Ridgewood");
    }

    @Test
    public void cheapestHotelListTest(){
        LocalDate date1=LocalDate.of(2020,10,10);
        LocalDate date2=LocalDate.of(2020,10,11);
        HotelReservation cheaphotel = HotelReservationSystem.CheapHotelList(date1,date2);
        Assertions.assertEquals("Lakewood",cheaphotel.HotelName);
    }

}