class AreaCalculator {
    void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    void area(double base, double height) {
        System.out.println("Area of triangle: " + (0.5 * base * height));
    }
}

public class Methodoverloading1 {
    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();
        a.area(5);
        a.area(4, 7);
        a.area(3.0, 6.0);
    }
}
