package HotelReservationTest;

import HotelReservation.HotelReservation;
import HotelReservation.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.*;


import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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


        HotelReservation lakewood = new HotelReservation("Lakewood", 100, 120,3);
        HotelReservation Bridgewood = new HotelReservation("Bridgewood", 200, 240,4);
        HotelReservation Ridgewood = new HotelReservation("Ridgewood", 300, 350,5);


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


}
