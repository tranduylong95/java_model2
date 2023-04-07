package org.example;
import java.util.Scanner;
public class CurrencyVND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate=23000;
        System.out.println("USD: ");
        double usd= scanner.nextDouble();
        int currency=(int)(rate*usd);
        System.out.println("VND:"+currency);
    }
}
