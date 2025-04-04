import java.util.Date;
import java.text.DateFormat;
import java.lang.System;

public class Package4 {
    public static void main(String[] args) {
        Date now = new Date();
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
        System.out.println("Formatted Date: " + df.format(now));
    }
}
