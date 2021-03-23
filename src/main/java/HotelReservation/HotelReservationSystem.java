package HotelReservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class HotelReservationSystem {

    public static LocalDate date1 = LocalDate.parse("2020-09-11");
    public static LocalDate date2 = LocalDate.parse("2020-09-12");
    public static ArrayList<HotelReservation> hotels = new ArrayList<>();


    public static ArrayList<HotelReservation> AddHotel(HotelReservation hotel) {
        System.out.println("Welcome to Hotel Reservation");
        hotels.add(hotel);
        return hotels;
    }

    public static void Date(String s1, String s2) throws InvalidException {
        String dateFormat;
        dateFormat = "^([0-9]{4})-(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])$";
        if (s1.matches(dateFormat) && s2.matches(dateFormat)) {
            date1 = LocalDate.parse(s1);
            date2 = LocalDate.parse(s2);
        } else {
            throw new InvalidException();
        }
    }
    public static TreeMap<Long, ArrayList<HotelReservation>> weekEndWeekDaysRates(int customerType) throws InvalidException {
        TreeMap<Long, ArrayList<HotelReservation>> hotelRates = new TreeMap<>();
        for (HotelReservation hotel: hotels){
            long rate = totalRates(hotel, customerType);

            ArrayList<HotelReservation> thisRateHotel = hotelRates.get(rate);
            if(thisRateHotel == null){
                thisRateHotel = new ArrayList<>();
            }
            thisRateHotel.add(hotel);
            hotelRates.put(rate, thisRateHotel);
        }
        return hotelRates;

    }
    public static void showCheapHotel(int customerType ) throws InvalidException {

        TreeMap<Long, ArrayList<HotelReservation>> hotelRates = weekEndWeekDaysRates(customerType);
        System.out.print("\ncheapest hotels are " );
        boolean seen = false;
        Long best = null;
        for (Long aLong : hotelRates.keySet()) {
            if (!seen || aLong < best) {
                seen = true;
                best = aLong;
            }
        }
        long minRate;
        if (seen) minRate = Optional.of(best).get();
        else minRate = Optional.<Long>empty().get();

        for (HotelReservation hotel: hotelRates.get(minRate)){
            System.out.print(hotel.HotelName + " ");
        }
        System.out.println("cheapest hotels are with rate: "+ minRate);
    }//sCH

    public static HotelReservation cheapestHotelByRating(int customerType) throws InvalidException {

        TreeMap<Long, ArrayList<HotelReservation>> hotelRates = weekEndWeekDaysRates(customerType);
        boolean seen = false;
        Long best = null;
        for (Long aLong : hotelRates.keySet()) {
            if (!seen || aLong < best) {
                seen = true;
                best = aLong;
            }
        }
        long minRate;
        if (!seen) minRate = Optional.<Long>empty().get();
        else minRate = Optional.of(best).get();

        return hotelRates.get(minRate).stream().max(Comparator.comparing(r -> r.Rating)).get();

    }

    public static HotelReservation BestRatedHotel(){
        return hotels.stream().max(Comparator.comparing(r -> ((Integer) r.Rating))).get();

    }

    public static long totalRates(int customerType) throws InvalidException {
        long rate = 0;
        LocalDate d = date1;
        d = d.plusDays(1);
        for(LocalDate date = date1; date.isBefore(date1); date = date.plusDays(1)){
            String today = DayOfWeek.from(date).name();
            if(today.equals(DayOfWeek.SATURDAY.toString()) || today.equals(DayOfWeek.SUNDAY.toString()) ) {
                rate+= HotelReservation.weekendrate[customerType];
            }else {
                rate+= HotelReservation.weekdayrate[customerType];
            }
        }
        return rate;
    }

}
