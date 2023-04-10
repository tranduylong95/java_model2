package org.example;

import java.util.Scanner;

public class PrimeMax100 {
    public static void main(String[] args) {
         int number=2;
            while (number<100){
                if(CheckPrime(number)){
                    System.out.print(number +",");
                }
                number++;
            }

    }
    static boolean CheckPrime(int number) {
        int i = 2;
        boolean check = true;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        return check;
    }
}
