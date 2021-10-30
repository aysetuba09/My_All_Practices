package java_questions_group_3;
/*
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.For example, given N = 4, the function could return [1,0, -3,2] or[-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).


 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUniqueIntegersSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");// N
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
          if(arr[i] != arr[i + 1])
            System.out.println("Element at index " + (i + 1));
arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

}
