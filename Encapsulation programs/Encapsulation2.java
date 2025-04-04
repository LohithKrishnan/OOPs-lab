class HotelBooking {
    private int nights;
    private double pricePerNight;

    public void setNights(int nights) {
        this.nights = nights > 0 ? nights : 0;
    }

    public void setPricePerNight(double price) {
        this.pricePerNight = price > 0 ? price : 0;
    }

    public double getBookingCost() {
        return nights * pricePerNight;
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        HotelBooking booking = new HotelBooking();
        booking.setNights(4);
        booking.setPricePerNight(100);
        System.out.println("Total Hotel Booking Cost: $" + booking.getBookingCost());
    }
}
