package HotelReservation;

public class HotelReservation {
    String HotelName;
    public int weekdayrate;
    public int weekendrate;

    public HotelReservation(String HotelName,int weekdayrate, int weekendrate) {
        this.HotelName = HotelName;
        this.weekendrate = weekendrate;
        this.weekdayrate = weekdayrate;
    }

    @Override
    public String toString() {
        return "HotelReservation { " +
                "hotelName=" + HotelName +  ", Weekdayrate=" + weekdayrate +", Weekend=" + weekendrate+"}";
    }

}