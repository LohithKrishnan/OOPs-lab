import java.util.Scanner;

   public class AreaOfTriangle {
	static double area (double h, double b) {
	return (h*b)/2;
	}

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter height:");
	double h = scanner.nextDouble();
	System.out.println("Enter breadth:");
	double b = scanner.nextDouble();
	System.out.println("Area of the triangle: "+ area(h,b));
	}
}