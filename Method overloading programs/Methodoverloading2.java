class Converter {
    void convert(int km) {
        System.out.println(km + " km = " + (km * 1000) + " meters");
    }

    void convert(double kg) {
        System.out.println(kg + " kg = " + (kg * 2.20462) + " pounds");
    }

    void convert(int hours, int minutes) {
        int totalMinutes = (hours * 60) + minutes;
        System.out.println(hours + "h " + minutes + "m = " + totalMinutes + " minutes");
    }
}

public class Methodoverloading2 {
    public static void main(String[] args) {
        Converter c = new Converter();
        c.convert(5);
        c.convert(2.5);
        c.convert(1, 30);
    }
}
