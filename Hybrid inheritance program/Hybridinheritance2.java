class Gadget {
    String brand;
    Gadget(String brand) {
        this.brand = brand;
    }
    void info() {
        System.out.println("Brand: " + brand);
    }
}

class Phone extends Gadget {
    Phone(String brand) {
        super(brand);
    }
    void makeCall() {
        System.out.println(brand + " phone is making a call.");
    }
}

class Laptop extends Gadget {
    Laptop(String brand) {
        super(brand);
    }
    void compileCode() {
        System.out.println(brand + " laptop is compiling code.");
    }
}

interface SmartDevice {
    void connectToWiFi();
}

class SmartPhone extends Phone implements SmartDevice {
    SmartPhone(String brand) {
        super(brand);
    }
    public void connectToWiFi() {
        System.out.println(brand + " smartphone is connected to WiFi.");
    }
}

public class Hybridinheritance2 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Samsung");
        sp.info();
        sp.makeCall();
        sp.connectToWiFi();
    }
}
