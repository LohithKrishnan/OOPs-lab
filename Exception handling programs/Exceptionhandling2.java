import java.util.Scanner;

class ShortPasswordException extends Exception {
    public ShortPasswordException(String message) {
        super(message);
    }
}

public class Exceptionhandling2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            if (password.length() < 6) {
                throw new ShortPasswordException("Password must be at least 6 characters");
            }
            System.out.println("Password accepted");
        } catch (ShortPasswordException e) {
            System.out.println("Weak password: " + e.getMessage());
        }

        scanner.close();
    }
}
