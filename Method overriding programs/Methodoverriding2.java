class Language {
    void sayHello() {
        System.out.println("Hello in a generic language");
    }
}

class English extends Language {
    void sayHello() {
        System.out.println("Hello");
    }
}

class Spanish extends Language {
    void sayHello() {
        System.out.println("Hola");
    }
}

class French extends Language {
    void sayHello() {
        System.out.println("Bonjour");
    }
}

public class Methodoverriding2 {
    public static void main(String[] args) {
        Language l;
        l = new English();
        l.sayHello();
        l = new Spanish();
        l.sayHello();
        l = new French();
        l.sayHello();
    }
}
