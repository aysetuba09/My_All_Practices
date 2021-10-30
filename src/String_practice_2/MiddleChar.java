package String_practice_2;
/*
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters. b) If the length of the
string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph
 */

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int mid = word.length() / 2;
        if(word.length() % 2 == 0){
            System.out.println(word.substring(mid -1,mid + 1));
        }
        if(word.length() % 2 == 1){
            System.out.println(word.substring(mid , mid +1));
        }
    }
}
