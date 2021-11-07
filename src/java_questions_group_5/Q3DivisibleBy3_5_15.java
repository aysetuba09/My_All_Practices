package java_questions_group_5;

public class Q3DivisibleBy3_5_15 {

    /*
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

    if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section


     */

    public static String divisibleBy15(int num){
        String result = "";
        if(num % 3 == 0 && num % 5 == 0){
            result = "" + num + " is divisible by 15";
        }
        return result;
    }
    public static String divisibleBy3(int num){
        String result = "";
        if(num % 3 == 0 && num % 5 != 0){
            result = "" + num + " is divisible by 3";
        }
        return result;
    }
    public static String divisibleBy5(int num){
        String result = "";
        if(num % 3 != 0 && num % 5 == 0){
            result = "" + num + " is divisible by 5";
        }
        return result;

    }

    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {


            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(divisibleBy15(num));
            } else if (num % 3 != 0 && num % 5 == 0) {
                System.out.println(divisibleBy5(num));
            } else if (num % 3 == 0 && num % 5 != 0) {
                System.out.println(divisibleBy3(num));
            } else {
                System.out.println(num);
            }
        }

    }
}
