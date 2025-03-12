import java.util.Scanner;

public class PositveOrNegative {
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter an integer:");
	int number = scanner.nextInt();

	if (number > 0) {
	System.out.println(number + " is positive.");
	}
	else if (number < 0) {
	System.out.println(number + " is negative.");
	}
	else {
	System.out.println(number + " is zero.");
	}
   }
}