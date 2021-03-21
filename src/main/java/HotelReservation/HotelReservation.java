package HotelReservation;

public class HotelReservation {
    String HotelName;
    int Rating;
    int rate;

    public HotelReservation(String HotelName,int Rating, int rate) {
        this.HotelName = HotelName;
        this.Rating = Rating;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "HotelReservation { " +
                "hotelName=" + HotelName +  ", rating=" + Rating +", rate=" + rate+"}";
    }

}
