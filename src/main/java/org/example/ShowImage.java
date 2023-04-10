package org.example;
import java.util.Scanner;
public class ShowImage {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int menuStatus=0;
        while (menuStatus==0) {
            int optionnal = 0;
            System.out.println(
                    "1.Print the rectangle\n" +
                            "\n" +
                            "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                            "\n" +
                            "3.Print isosceles triangle\n" +
                            "\n" +
                            "4.Exit ");
            optionnal = scanner.nextInt();
            if (optionnal == 1) {
                System.out.flush();
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 6; j++) {
                        if (j == 6)
                            System.out.print("*\n");
                        else
                            System.out.print("* ");
                    }
                }
            }
            if (optionnal == 2) {
                System.out.print("botton-left \n");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                System.out.print("top-left \n");
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            }
            if(optionnal==3){
                int k=0;
                for (int i=1;i<=6;i++,k=0){
                    for (int j=1;j<=6-i;j++){
                        System.out.print("  ");
                    }
                    while (k != 2 * i - 1) {
                        System.out.print("* ");
                        ++k;
                    }
                    System.out.println();
                }
            }
            if (optionnal == 4) menuStatus=1;
        }
    }
}



