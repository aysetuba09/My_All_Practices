package java_questions_group_4;
/*
Write  a method which can identifies given number is even or odd

EX:

identify(5) ->  "Odd"

identify(6) ->  "Even".
 */

public class NumbersOddEven {
    public static String oddEven(int a){
        String result = "";
        if(a % 2 == 0){
            result = "Even";
        }else {
            result = "Odd";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(oddEven(23));
    }
}
