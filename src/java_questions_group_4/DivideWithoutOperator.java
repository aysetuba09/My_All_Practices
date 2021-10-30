package java_questions_group_4;
/*
Write a method that can divide two numbers without using division operator.
 */

public class DivideWithoutOperator {
    public static int divideNumbers(int a, int b) {
        //a is dividend
        //b is divisor

        int count = 0;
        if (b != 0) {
            System.out.println("Division is undefined");
        } else {
            while (a - b >= 0) {
                a -= b;
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int a = 21;
        int b = 5;
        System.out.println(divideNumbers(21, 5));
    }
}

