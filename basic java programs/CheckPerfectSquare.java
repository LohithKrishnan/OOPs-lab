import java.util.Scanner;

   public class CheckPerfectSquare {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter an integer:");
	int number = scanner.nextInt();
	int sqrt = (int) Math.sqrt(number);

	if (sqrt*sqrt == number) {
	System.out.println(number + " is a perfect square.");
	}
	else {
	System.out.println(number + " is not a perfect square.");
	}
   }
}