class Loan {
    private double principal;
    private double rate;
    private int years;

    public void setPrincipal(double principal) {
        this.principal = principal > 0 ? principal : 0;
    }

    public void setRate(double rate) {
        this.rate = rate > 0 ? rate : 0;
    }

    public void setYears(int years) {
        this.years = years > 0 ? years : 0;
    }

    public double getTotalInterest() {
        return (principal * rate * years) / 100;
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Loan loan = new Loan();
        loan.setPrincipal(10000);
        loan.setRate(5);
        loan.setYears(3);
        System.out.println("Total Interest: $" + loan.getTotalInterest());
    }
}
