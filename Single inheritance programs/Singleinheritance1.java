class Bank {
    String bankName = "SBI";
    String branch = "Mumbai";

    void showBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branch);
    }
}

class Account extends Bank {
    String accountHolder;
    int accountNumber;

    Account(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class Singleinheritance1 {
    public static void main(String[] args) {
        Account acc1 = new Account("Arjun", 567890);
        acc1.showBankDetails();
        acc1.showAccountDetails();
    }
}
