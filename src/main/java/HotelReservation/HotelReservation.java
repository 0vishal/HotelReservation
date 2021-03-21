package HotelReservation;

public class HotelReservation {
    public String HotelName;
    public int rate;
    public int Rating;

    public HotelReservation(String HotelName,int rate,int Rating) {
        this.HotelName = HotelName;
        this.rate = rate;
        this.Rating = Rating;
    }

    @Override
    public String toString() {
        return "HotelReservation { " +
                "hotelName=" + HotelName +  ", Rate=" + rate +"Rating"
                + Rating +""; }
}