package HotelReservation;
public class InvalidException extends Exception {
    public InvalidException() {
        super("Invalid Data Provided");
    }
}