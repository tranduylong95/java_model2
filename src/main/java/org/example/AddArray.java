package org.example;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int [] input ={2,3,4,5,6,7,8,9,0};
        int [] output=new int[input.length+1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần chèn");
        int valueInsert=scanner.nextInt();
        System.out.println("Nhập vị trí  cần chèn");
        int indexInsert=scanner.nextInt();
        if(indexInsert<=-1&& indexInsert>=input.length-1){
            System.out.print("Không chèn được vị trí trong mảng");
        }
        else {
            int arrayLengthOdd=input.length-1;
            for(int i=output.length-1;i>=0;i--){
                if(i==indexInsert){
                    output[i]=valueInsert;
                }
                else {
                    output[i]=input[arrayLengthOdd--];
                }
            }
        }
        for(int value:output){
            System.out.print(value+",");
        }
    }
}
