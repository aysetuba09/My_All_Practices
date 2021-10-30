package String_practice_1;
/*
Given three String variables of some text find and print the longest word that also
contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"
        Output: java
    Ex:
        "java"
        "mouse"
        "apples"
        Output: apples

Challenge: Instead of just checking for 'a' add another variable that can be used to
check for any character.
 */

import java.util.Arrays;
import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter array size");
//        String[] arr = new String[s.nextInt()];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter " + (i + 1) + " element");
//            arr[i] = s.next();
//
//        }
//        System.out.println(Arrays.toString(arr));
        String [] arr = { "apple", "array", "java"};
        String max = "apple";
        String result = "";
        for (int i = 0; i < arr.length; i++) {
           if(arr[i].contains("a")){
               if(arr[i].length() > max.length() ){
                   result = arr[i];
               }
           }
        }
        System.out.println(result);


    }
}
//TODO KOD YAZMIYOR

