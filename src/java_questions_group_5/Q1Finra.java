package java_questions_group_5;
/*
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

 */

public class Q1Finra {

    public static String finra(int num){

        String result = "";
        if(num % 3 == 0 && num % 5 == 0){
            result = "finra";
        }else if(num % 3 == 0){
            result = "fin";
        }else if (num % 5 == 0){
            result = "ra";
        }else{
            result = Integer.toString(num);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(finra(17));
    }

}
