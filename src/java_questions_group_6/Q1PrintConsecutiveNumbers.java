package java_questions_group_6;
/*
Write a function that, given a positive integer N, prints the consecutive from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

 */

public class Q1PrintConsecutiveNumbers {
    public static String getNumbers(int N) {
        String result = "";
        for (int a = 1; a < N; a++) {
            if (a % 2 == 0 && a % 3 == 0 && a % 5 == 0) {
                result += "CodilityTestCoders\n";
            } else if (a % 2 == 0 && a % 3 == 0) {
                result += "CodilityTest\n";
            } else if (a % 2 == 0 && a % 5 == 0) {
                result += "CodilityCoders\n";
            } else if (a % 3 == 0 && a % 5 == 0) {
                result += "TestCoders\n";
            } else if (a % 2 == 0) {
                result += "Codility\n";
            } else if (a % 3 == 0) {
                result += "Test\n";
            } else if (a % 5 == 0) {
                result += "Coders\n";
            } else {
                result += a + "\n";
            }

        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(getNumbers(100));
    }
}
