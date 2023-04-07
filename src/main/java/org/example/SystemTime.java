package org.example;

import java.util.Date;
import java.text.SimpleDateFormat;
public class SystemTime {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

        System.out.println("Now is: " + df.format(now));
    }
}
