package HotelReservation;


import java.util.ArrayList;



public class HotelReservationSystem {

       public static ArrayList<String> AddHotel(String hotel) {
           System.out.println("Welcome to Hotel Reservation");
           ArrayList<String> addhotel = new ArrayList<>();
           addhotel.add(hotel);
           return addhotel;
       }


   }