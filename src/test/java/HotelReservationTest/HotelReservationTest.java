package HotelReservationTest;

import HotelReservation.HotelReservation;
import HotelReservation.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.text.MessageFormat;

import static HotelReservation.HotelReservationSystem.*;
import static jdk.nashorn.internal.objects.NativeDate.setDate;

public class HotelReservationTest {

    HotelReservationSystem hotelsystem;

    @BeforeAll
    public void execute() {
        hotelsystem = new HotelReservationSystem();
        hotelsystem.AddHotel(lakewood);
        hotelsystem.AddHotel(Bridgewood);
        hotelsystem.AddHotel(Ridgewood);
    }


    HotelReservation lakewood = new HotelReservation("Lakewood", 3,100, 120,80, 80);
    HotelReservation Bridgewood = new HotelReservation("Bridgewood", 4,200,240, 110,50);
    HotelReservation Ridgewood = new HotelReservation("Ridgewood", 5,300, 350,100,40);



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
    public void bestRateHotelTest() throws InvalidException {
        Assertions.assertEquals(Ridgewood, BestRatedHotel());
        System.out.println("Best rated Hotel: " + BestRatedHotel().HotelName + "  Rate:  "  + totalRates(BestRatedHotel(), customerType) );
    }
    @Test
    public void getCheapestHotelByRatesRegular() throws InvalidException {
        Assertions.assertEquals(lakewood, cheapestHotelByRating(HotelReservation.REWARD_CUSTOMER));
        showCheapHotel(HotelReservation.REWARD_CUSTOMER);

    }

    @Test
    public void getCheapestHotelByRatingsRegularTest() throws InvalidException {
        HotelReservation cheapestHotelByRatings = HotelReservationSystem.cheapestHotelByRating(HotelReservation.REWARD_CUSTOMER);
        Assertions.assertEquals(Bridgewood, cheapestHotelByRatings);
        System.out.println("Cheapest hotel by rating: " + cheapestHotelByRatings.HotelName;
    }

    @Test
    public void getBestRatedHotelRegularTest() throws InvalidException {
        Assertions.assertEquals(Ridgewood, BestRatedHotel());
        System.out.println(MessageFormat.format("Best rated Hotel: {0}  total Rate:  {1}", BestRatedHotel().HotelName, totalRates(BestRatedHotel(), HotelReservation.REWARD_CUSTOMER)));
    }

}