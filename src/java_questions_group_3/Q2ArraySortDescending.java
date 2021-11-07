package java_questions_group_3;
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};arr = Sort(arr) ==>{90, 20, 10, 8, 7};


 */

import java.util.Arrays;

public class Q2ArraySortDescending {
    public static int[] arraySortDescending(int [] arr){

        int num1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                     num1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num1;

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(arraySortDescending(arr)));
    }
}
