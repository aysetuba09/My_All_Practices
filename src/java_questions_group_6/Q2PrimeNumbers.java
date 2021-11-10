package java_questions_group_6;
/*
Write a method that can check if a number is prime or not

 */

public class Q2PrimeNumbers {

    public static String getPrimeNumber(int a){ // write boolean to check
String check = "";
        if(a <= 1){ // prime number cannot less than 1
            check = a+ " is not prime";
        }
        if(a ==2){ // the smallest and only even prime number is 2
            check = a + " is prime number";
        }
        // 28/2 14/2 7/2
        for (int i = 3; i <= a /2; i++) {  // a= 28/14  a=30  30/15 if I write i = a this condition always true start with smaller divider
          if(a % i == 0 ){
               check = a + " is  prime";
               break; // it is enough 1 loop to check if it is divisible
}
          check = a + " is not prime";
        }

        return check;
    }

    public static void main(String[] args) {
        System.out.println(getPrimeNumber(30));
    }

}
