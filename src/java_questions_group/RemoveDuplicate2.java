package java_questions_group;
/*String -- Remove Duplicates.
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC*/

import java.util.Scanner;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(uniqueChars(s.next()));
    }
    public static String uniqueChars(String str){
        String allUnique = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0 ; // to reset every loop
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count ++;
                }
                if(!allUnique.contains("" + str.charAt(i))){
                    if(count == 1){
                        allUnique += str.charAt(i);
                    }
                }
            }
        }
        return  allUnique;
    }
}
