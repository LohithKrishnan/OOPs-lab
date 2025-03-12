import java.util.Scanner;
  
   public class OddOrEven {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a integer: ");
	int n = scanner.nextInt();

	if (n % 2 == 0) {
	System.out.println("Entered Number is Even");
	}
	else {
	System.out.println("Entered Number is Odd");
	}
   }
}