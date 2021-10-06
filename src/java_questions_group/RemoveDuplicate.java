package java_questions_group;

public class RemoveDuplicate {
    /*Q3: String -- Remove Duplicates.
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC

     */
    public static String removeDuplicate(String word){//aaabbbccc
        String result = "";
        for (int i = 0; i < word.length(); i++) { //i=0, a i=1, a
            if(!result.contains(""+word.charAt(i))){
                result += word.charAt(i);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("aaabbbbcccc"));
    }
}
