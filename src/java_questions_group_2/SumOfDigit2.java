package java_questions_group_2;
/*sum of digits in a string: Write a method that can return the sum of the digits in a string.
*/

public class SumOfDigit2 {
    public static void main(String[] args) {
        SumOfDigit2 sum = new SumOfDigit2();
        String t = "abcd4758";
        System.out.println(sum.sumOfDigit2(t));
    }
    public int sumOfDigit2(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt("" + str.charAt(i));
            }
        }
        return sum;

    }


}

