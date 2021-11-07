package java_questions_group_2;
/*Find Minimum: Write a method that can find the maximum number from an int Array.*/

import java.util.Arrays;
import java.util.Scanner;

public class Q9FindMin {
    public static void findMinArrayElement(int [] nums){

        int min = nums [0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("Min number is " + min);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your array size");
        int [] nums = new int [s.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter your " + (i + 1) + ". element");
            nums[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        findMinArrayElement(nums);
    }
}
