package java_questions_group;

public class FindTheUnique {
    /*Q4: String -- Find the unique
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/
    public static String findTheUnique(String str){

        String result="";

        for (int i = 0; i < str.length(); i++) {
            if(result.indexOf(str.charAt(i)) == -1 ){
                result = result + str.charAt(i);
            }
        }
        return  result;



    }

    public static void main(String[] args) {
        System.out.println(findTheUnique("aaabbbdef"));
    }
}
