package java_questions_group_2;

import java.util.Scanner;

public class SumOfDigit {
    public static int sumOfDigit(String str){
        int sum = 0;
        for(char each : str.toCharArray()){
            if(Character.isDigit(each)){
                sum += Character.getNumericValue(each);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(sumOfDigit(str));
    }
}