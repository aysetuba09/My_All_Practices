package java_questions_group_5;

import java.util.Arrays;

public class Q2SwapNumbers {
    /*
    Swap two variable' values without using a third variable

     */

    public static void main(String[] args) {


    
        int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                           + " x = " + x + ", y = " + y);
    }



}
