import java.util.Scanner;

   public class squaresum {
	public static int squaresum(int n) {
	int sum = 0;
	for (int i = 1; i <= n; i++)
	sum += (i* i);
	return sum;
	}
	
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a integer: ");
	int n = scanner.nextInt();
	System.out.println(squaresum(n));
	}
}