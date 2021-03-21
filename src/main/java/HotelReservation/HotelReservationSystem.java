package HotelReservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class HotelReservationSystem {

    public static LocalDate date1 = LocalDate.parse("2020-09-11");
    public static LocalDate date2 = LocalDate.parse("2020-09-12");
    public static ArrayList<HotelReservation> hotels = new ArrayList<>();


    public static ArrayList<HotelReservation> AddHotel(HotelReservation hotel) {
        System.out.println("Welcome to Hotel Reservation");
        hotels.add(hotel);
        return hotels;
    }



    public static HotelReservation BestRatedHotel(){
        return hotels.stream().max(Comparator.comparing(r -> ((Integer) r.Rating))).get();

    }

    public static long totalRates(HotelReservation hotel){
        long rate = 0;
        LocalDate d = date1;
        d = d.plusDays(1);
        for(LocalDate date = date1; date.isBefore(date1); date = date.plusDays(1)){
            String today = DayOfWeek.from(date).name();
            if(today.equals(DayOfWeek.SATURDAY.toString()) || today.equals(DayOfWeek.SUNDAY.toString()) ) {
                rate += hotel.weekendrate;
            }else {
                rate+= hotel.weekdayrate;
            }
        }
        return rate;
    }

}
