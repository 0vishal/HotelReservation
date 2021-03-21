package HotelReservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class HotelReservationSystem {

    public static LocalDate d1 = LocalDate.parse("2020-09-11");
    public static LocalDate d2 = LocalDate.parse("2020-09-12");
    public static ArrayList<HotelReservation> hotels = new ArrayList<>();


    public static ArrayList<HotelReservation> AddHotel(HotelReservation hotel) {
        System.out.println("Welcome to Hotel Reservation");
        hotels.add(hotel);
        return hotels;
    }

    public static TreeMap<Long, ArrayList<HotelReservation>> weekEndORWeekDaysRates(LocalDate date1, LocalDate date2 ){
        TreeMap<Long, ArrayList<HotelReservation>> hotelRates = new TreeMap<>();
        date2 = date2.plusDays(1);
        for (HotelReservation hotel: hotels){
            long rate = 0;
            for(LocalDate date = date1; date.isBefore(date2); date = date.plusDays(1)){
                String today = DayOfWeek.from(date).name();
                if(today.equals(DayOfWeek.SATURDAY.toString()) || today.equals(DayOfWeek.SUNDAY.toString()) ) {
                    rate += hotel.weekendrate;
                }else {
                    rate+= hotel.weekdayrate;
                }
            }
            ArrayList<HotelReservation> ThisHotelRate = hotelRates.get(rate);
            if(ThisHotelRate == null){
                ThisHotelRate = new ArrayList<>();
            }
            ThisHotelRate.add(hotel);
            hotelRates.put(rate, ThisHotelRate);
        }
        return hotelRates;
    }
    public static long cheapHotel(){
        LocalDate date1 = LocalDate.parse("2020-09-11");
        LocalDate date2 = LocalDate.parse("2020-09-12");
        TreeMap<Long, ArrayList<HotelReservation>> hotelRates = weekEndORWeekDaysRates(date1,date2);
        System.out.print("\ncheapest hotels are " );
        long min = hotelRates.keySet().stream().min(Long::compare).get();
        for (HotelReservation hotel: hotelRates.get(min)){
            System.out.print(hotel.HotelName + " ");
        }
        System.out.println("with rate: "+ min);
        return min;
    }
}
