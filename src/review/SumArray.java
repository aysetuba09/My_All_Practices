package review;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        int [] newArr = Arrays.copyOf(arr, arr.length + 1);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        newArr[arr.length]= sum;
        System.out.println(Arrays.toString(newArr));
    }
}
