class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length > 0 ? length : 0;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 0;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

public class Encapsulation4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(3);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}