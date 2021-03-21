package HotelReservationTest;

import HotelReservation.HotelReservation;
import HotelReservation.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static HotelReservation.HotelReservationSystem.cheapHotel;

public class HotelReservationTest {

    HotelReservationSystem hotelsystem;

    @BeforeAll
    public void execute() {
        hotelsystem = new HotelReservationSystem();
        hotelsystem.AddHotel(lakewood);
        hotelsystem.AddHotel(Bridgewood);
        hotelsystem.AddHotel(Ridgewood);
    }


    HotelReservation lakewood = new HotelReservation("Lakewood", 100, 120);
    HotelReservation Bridgewood = new HotelReservation("Bridgewood", 200, 240);
    HotelReservation Ridgewood = new HotelReservation("Ridgewood", 300, 350);



    @Test
    public void TestData() {
        Assertions.assertEquals("Lakewood","Lakewood");
        Assertions.assertEquals("Bridgewood","Bridgewood");
        Assertions.assertEquals("Ridgewood","Ridgewood");

    }

    @Test
    public void weekDayRates(){
        Assertions.assertEquals(100,lakewood.weekendrate);
        Assertions.assertEquals(200,Bridgewood.weekdayrate);
        Assertions.assertEquals(300,Ridgewood.weekdayrate);
    }

    @Test
    public void weekEndRates(){
        Assertions.assertEquals(120,lakewood.weekendrate);
        Assertions.assertEquals(240,Bridgewood.weekendrate);
        Assertions.assertEquals(350,Ridgewood.weekendrate);
    }
    @Test
    public void getCheapestHotel() {
        Assertions.assertEquals(lakewood,cheapHotel());
        cheapHotel();
    }

}