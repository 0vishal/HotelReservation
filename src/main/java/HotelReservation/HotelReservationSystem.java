package HotelReservation;

import java.util.ArrayList;

public class HotelReservationSystem {

    public static ArrayList<HotelReservation> hotels = new ArrayList<>();
    private static HotelReservation hotel;


    public static ArrayList<HotelReservation> AddHotel(HotelReservation hotel) {
        HotelReservationSystem.hotel = hotel;
        System.out.println("Welcome to Hotel Reservation");
        hotels.add(hotel);
        return hotels;
    }
}

