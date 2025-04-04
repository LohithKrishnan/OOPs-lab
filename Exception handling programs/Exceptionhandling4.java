import java.util.Scanner;

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class Exceptionhandling4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new UnderageException("You must be at least 18 years old to vote.");
            }
            System.out.println("You are eligible to vote.");
        } catch (UnderageException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }

        sc.close();
    }
}
