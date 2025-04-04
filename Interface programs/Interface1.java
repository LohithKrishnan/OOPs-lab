interface MyMath {
    void Add(int a, int b);
    void Subtract(int a, int b);
    void Multiply(int a, int b);
    void Divide(int a, int b);
}

class Calculation implements MyMath {

    public void Add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    public void Subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    public void Multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    public void Divide(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

public class Interface1 {
    public static void main(String[] args) {
        MyMath num = new Calculation();
        num.Add(4, 6);
        num.Subtract(10, 3);
        num.Multiply(5, 2);
        num.Divide(9, 3);
        num.Divide(10, 0);
    }
}
