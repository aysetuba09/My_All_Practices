package java_questions_group_6;
/*
Write a method that can check if a number is Armstrong number

 */

public class Q3ArmstrongNumbers {
    //371 = 3*3*3 + 7*7*7 + 1*1*1
    public static int getArmstrongNumbers(int a){

        int result = 0, remainder;
        while(a != 0){ // a = 0 because of int for last step
            remainder = a % 10; // find place values like ones, tens, hundreds // 371 % 10 = 1 // 37 % 10 = 7
            result +=  Math.pow(remainder,3); //1*1*1 it has 3 place values
            a /= 10; // it will be 37 // to get tens // to get
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 371;
        int arm = getArmstrongNumbers(num); // because of return method I can store them
        if(num == arm){
            System.out.println( num + " is Armstrong number");
        }else{
            System.out.println(num + " is not Armstrong number");
        }

    }
}
