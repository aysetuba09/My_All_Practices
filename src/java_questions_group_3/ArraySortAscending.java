package java_questions_group_3;
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
 int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};

 */

import java.util.Arrays;

public class ArraySortAscending {
    public static int[] arraySortAscending(int [] arr){

            int num;// temporary number
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
;                      num = arr[i];
arr[i] = arr[j];
arr[j] = num;

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(arraySortAscending(arr)));
    }

}
