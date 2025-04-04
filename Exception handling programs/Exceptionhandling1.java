import java.util.Scanner;

public class Exceptionhandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a value: ");
        String input = sc.nextLine();

        try {
            double number = Double.parseDouble(input);
            System.out.println("Valid number format: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}
