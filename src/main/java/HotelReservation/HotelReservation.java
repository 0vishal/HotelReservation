package HotelReservation;

public class HotelReservation {
    public String HotelName;
    public int Rating;
    public static final int REGULAR_CUSTOMER = 0;
    public static final int REWARD_CUSTOMER = 1;
    public  static int[] weekdayrate = new int[2];
    public static int[] weekendrate = new int[2];


    public HotelReservation(String HotelName,int Rating,int regularWeekDayRate,int regularWeekEndRate ,int rewardWeekDayRate, int rewardWeekEndRate) {
        this.HotelName = HotelName;
        weekdayrate[REGULAR_CUSTOMER] = regularWeekDayRate;
        weekendrate[REGULAR_CUSTOMER] = regularWeekEndRate;
        weekdayrate[REWARD_CUSTOMER] = rewardWeekDayRate;
        weekendrate[REWARD_CUSTOMER] = rewardWeekEndRate;
        this.Rating = Rating;
    }

    @Override
    public String toString() {
        return "HotelReservation { " +
                "hotelName=" + HotelName +  "  Rating " +
                + Rating + "}";
    }

}