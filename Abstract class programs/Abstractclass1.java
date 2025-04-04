abstract class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Abstractclass1 {
    public static void main(String[] args) {
        Account acc = new SavingsAccount(1000);
        acc.withdraw(400);
    }
}
