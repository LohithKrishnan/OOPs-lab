import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class Exceptionhandling3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        try {
            if (!email.contains("@") || !email.contains(".")) {
                throw new InvalidEmailException("Email must contain '@' and '.'");
            }
            System.out.println("Email is valid.");
        } catch (InvalidEmailException e) {
            System.out.println("Invalid email: " + e.getMessage());
        }

        sc.close();
    }
}
