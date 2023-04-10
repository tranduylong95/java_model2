package org.example;

import java.lang.reflect.Array;
import java.util.Scanner;

public class RemovArray {
    public static void main(String[] args) {
        int [] input ={2,3,4,5,6,7,8,9,0};
        int index_del=-1;
        int [] output=new int[input.length-1];
        Scanner scanner = new Scanner(System.in);
        for(int value:input){
            if(input[input.length-1]!=value)
                System.out.print(value+",");
            else
                System.out.println(value);
        }
        System.out.println("Mời bạn nhập phần tử cần xóa");
        int elementRemove=scanner.nextInt();
        for (int i=0,k=0;i<input.length;i++){

            if(input[i]==elementRemove) {
                index_del = i;
                System.out.println("Vị trí xuất hiện là "+(index_del+1));
            }
           else {
                output[k]=input[i];
                k++;
            }
        }
        if(index_del==-1){
            System.out.println("Giá trị không xuất hiện");
        }
        else {
            for(int value:output){
                if(input[input.length-1]!=value)
                    System.out.print(value+",");
                else
                    System.out.println(value);
            }
        }
    }

}
