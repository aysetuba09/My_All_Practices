package java_questions_group_7;

public class Q1ReverseNegativeNumbers {
    /*
    Write a return method that can reverse negative number and return it as int.

     */
    public static int reverseNumbers(int num) {
        // a = - 123  reversed a = - 321
        int reversed= 0;
      while(num != 0){
          // get last digit from num

          int digit = num % 10;   //123 % 10 == 3    12 % 10 == 2   1
          reversed *= 10 + digit; //reversed = 0 + 3  3   // reversed = 30 + 2  32

          num /= 10; // to update
      }
        
return reversed;

    }

    public static void main(String[] args) {
        System.out.println(reverseNumbers(123));
    }
}
