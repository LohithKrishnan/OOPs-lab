interface Temperature {
    void ConvertToCelsius(int fahrenheit);
    void ConvertToFahrenheit(int celsius);
}

class Converter implements Temperature {
    public void ConvertToCelsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }

    public void ConvertToFahrenheit(int celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}

class Interface2 {
    public static void main(String[] args) {
        Temperature temp = new Converter();
        temp.ConvertToCelsius(100);
        temp.ConvertToFahrenheit(37);
    }
}
