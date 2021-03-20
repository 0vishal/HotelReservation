package HotelReservation;

public class HotelReservation {
    String HotelName;
    public int weekdayrate;
    public int weekendrate;
    public int Rating;

    public HotelReservation(String HotelName,int weekdayrate, int weekendrate,int Rating) {
        this.HotelName = HotelName;
        this.weekendrate = weekendrate;
        this.weekdayrate = weekdayrate;
        this.Rating = Rating;
    }

    @Override
    public String toString() {
        return "HotelReservation { " +
                "hotelName=" + HotelName +  ", Weekdayrate=" + weekdayrate +", Weekend=" + weekendrate+ "Rating"
        + Rating +""; }
    }

