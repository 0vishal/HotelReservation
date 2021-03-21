package HotelReservation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HotelReservationSystem {

    public static LocalDate d1 = LocalDate.parse("2020-09-11");
    public static LocalDate d2 = LocalDate.parse("2020-09-12");
    public static ArrayList<HotelReservation> hotels = new ArrayList<>();


    public static ArrayList<HotelReservation> AddHotel(HotelReservation hotel) {
        System.out.println("Welcome to Hotel Reservation");
        hotels.add(hotel);
        return hotels;
    }

    public static HotelReservation CheapHotelList(LocalDate d1,LocalDate d2) {
        long days= ChronoUnit.DAYS.between(d1,d2);
        HotelReservation min= Collections.min(hotels, Comparator.comparingInt(hotelrate->hotelrate.rate));
        int cheaprate = (int)(min.rate*days);
        System.out.println( "hotelname" + min.HotelName + "rate" + cheaprate);
        return min;

    }
}
