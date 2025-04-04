class MovieTicket {
    private String movieName;
    private int seats;
    private double pricePerSeat;

    public void setMovieName(String name) {
        movieName = name;
    }

    public void setSeats(int seats) {
        this.seats = seats > 0 ? seats : 0;
    }

    public void setPricePerSeat(double price) {
        this.pricePerSeat = price > 0 ? price : 0;
    }

    public double getTotalCost() {
        return seats * pricePerSeat;
    }

    public String getMovieName() {
        return movieName;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.setMovieName("Inception");
        ticket.setSeats(3);
        ticket.setPricePerSeat(12.5);
        System.out.println("Movie: " + ticket.getMovieName());
        System.out.println("Total Ticket Cost: $" + ticket.getTotalCost());
    }
}
