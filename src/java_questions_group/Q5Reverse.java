package java_questions_group;
/*String -- Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
*/

public class Q5Reverse {
    public static String reverse(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);



        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(reverse("java"));
    }
}
