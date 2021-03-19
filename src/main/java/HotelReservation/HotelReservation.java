package HotelReservation;

public class HotelReservation {
    String HotelName;
    public int weekdayrate;
    public int weekendrate;


    public HotelReservation(String HotelName,int weekdayrate, int weekendrate) {
        this.HotelName = HotelName;
        this.weekdayrate = weekdayrate;
        this.weekendrate = weekendrate;
    }

    @Override
    public String toString() {
        return "HotelReservation { " +
                "hotelName=" + HotelName +  ", rating=" + weekdayrate +", rate=" + weekendrate +"}";
    }

}
