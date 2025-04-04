class Payment {
    double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    void showAmount() {
        System.out.println("Payment Amount: $" + amount);
    }
}

class CreditCard extends Payment {
    String cardNumber;
    CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    void process() {
        System.out.println("Processing credit card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}
class UPI extends Payment {
    String upiID;
    UPI(double amount, String upiID) {
        super(amount);
        this.upiID = upiID;
    }
    void payViaUPI() {
        System.out.println("Paying $" + amount + " via UPI ID: " + upiID);
    }
}
public class Hierarchicalinheritance1 {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard(1200.50, "1234567890123456");
        UPI upi = new UPI(899.99, "lohith@upi");
        cc.showAmount();
        cc.process();
        upi.showAmount();
        upi.payViaUPI();
    }
}
