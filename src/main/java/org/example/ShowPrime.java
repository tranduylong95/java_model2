package org.example;
import java.util.Scanner;
public class ShowPrime {
    public static void main(String[] args) {
        int count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if(!CheckPrime(number)){
            System.out.print(number+" is not prime");
        }
        else{
            while (count<20){
                if(CheckPrime(number)){
                    System.out.print(number +",");
                    count++;
                }
                number++;
            }
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
