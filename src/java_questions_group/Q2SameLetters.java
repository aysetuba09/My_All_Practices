package java_questions_group;

import java.util.Arrays;

public class Q2SameLetters {
   /* Q2: String -- Same letters
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:
    */
public static boolean sameLetter (String word1, String word2){
    boolean check = false;
         if(word1.length() == word2.length()){
             String [] arr1 = word1.split("");// to convert string to array
             String [] arr2 = word2.split("");
             System.out.println(Arrays.toString(arr2));
             System.out.println(Arrays.toString(arr1));// printing to see String in array
             Arrays.sort(arr1);// sort based on ascii value
             System.out.println(Arrays.toString(arr1));
             Arrays.sort(arr2);
             System.out.println(Arrays.toString(arr2));
             if (Arrays.equals(arr1,arr2)) {// check equality of arrays
                 return true;
             }



return false;

         }
         return false;
}

    public static void main(String[] args) {
        System.out.println(sameLetter("abc", "cba"));
    }
}
