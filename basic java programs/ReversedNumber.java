import java.util.Scanner;

    public class ReversedNumber {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a positive integer: ");
	int n = scanner.nextInt();
	int reversed = 0;
	while (n != 0) {
	int digit = n % 10;
	reversed = reversed * 10 + digit;
	n /= 10;
	}
	System.out.println("Reversed Number: " + reversed);
     }
}