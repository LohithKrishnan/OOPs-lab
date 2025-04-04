class Shape {
    double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    double area() {
        return 3.14 * 5 * 5;
    }
}

class Square extends Shape {
    double area() {
        return 4 * 4; 
    }
}

class Rectangle extends Shape {
    double area() {
        return 4 * 6; 
    }
}

public class Methodoverriding1 {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        System.out.println("Circle Area: " + s.area());
        s = new Square();
        System.out.println("Square Area: " + s.area());
        s = new Rectangle();
        System.out.println("Rectangle Area: " + s.area());
    }
}
