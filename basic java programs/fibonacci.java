import java.util.Scanner;

    public class fibonacci {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a positive integer: ");
	int n=scanner.nextInt();
	int a = 0;
	int b=1;
	System.out.print(a+" "+b);
	for (int i=2; i<n; i++) {
	int next = a + b;
	System.out.print(" " + next);
	a=b;
	b=next;
	}
    }
}