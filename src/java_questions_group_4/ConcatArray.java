package java_questions_group_4;
/*
1. Array -- Concat two arrays
Write a return method that can concate two arrays.
 */

import java.util.Arrays;

public class ConcatArray {
    public static int [] addArrays(int [] arr1, int [] arr2){
//int [] arr1 = {1, 2, 3};
//int [] arr2 = {4, 5, 6};
 //              0  1  2  3  4  5
//int [] arr3 = {1, 2, 3, 4, 5, 6};
int arr1Length = arr1.length;//3
int arr2Length = arr2.length;//3
int arr3Length = arr1Length + arr2Length;
int [] arr3 = new int[arr3Length];// new array
        for (int i = 0; i < arr1Length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2Length; i++) {
            arr3 [arr1Length + i] = arr2[i];
        }





        return arr3;
    }

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(addArrays(arr1, arr2)));
    }
}
