package java_questions_group_2;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {

    public static  void findMaxArrayElement(int [] nums){


        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("Max number is " + max);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your array size");
        int [] nums = new int[s.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("enter your " + (i + 1) + " . element");
            nums[i] = s.nextInt();

        }
        System.out.println(Arrays.toString(nums));

findMaxArrayElement(nums);

    }

}
