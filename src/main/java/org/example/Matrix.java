package org.example;

public class Matrix {
    public static void main(String[] args) {
            int[][] array = {{1, 2 , 5, 6}, { 3, 4}, { 3, 4}, { 3, 4}};
            int max=array[0][0];
            max =findMaxMatrix(array);
            System.out.println("Giá trị lớn nhất trong ma trận là "+max);
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
}
