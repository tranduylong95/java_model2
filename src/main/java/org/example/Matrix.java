package org.example;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
//            int[][] array = {{1, 2 , 5, 6}, { 3, 4}, { 3, 4}, { 3, 4}};
//            int max=array[0][0];
//            max =findMaxMatrix(array);
//            System.out.println("Giá trị lớn nhất trong ma trận là "+max);
              int [][] array=new int[3][4];
              System.out.println("Mời bạn các phần tử trong  mảng");
              for (int i=0;i<array.length;i++){
                  for(int j=0;j<array[i].length;j++){
                      array[i][j]=scanner.nextInt();
                  }
              }
              int min=findMinMatrix(array);
             System.out.println("Giá trị nhỏ nhất trong ma trận là "+min);


    }
    public static int findMaxMatrix(int [][] array){
        int max = array[0][0];
        for(int [] item:array){
            for (int value:item){
                if(max<value) max=value;
            }
        }
        return max;
    }
    public static int findMinMatrix(int [][] array){
        int min = array[0][0];
        for(int [] item:array){
            for (int value:item){
                if(min>value) min=value;
            }
        }
        return min;
    }

}
