package String_practice_2;

import java.util.Scanner;

/**
 * [Remove first and last]
 * Given two words. Print the first word without its first character then print the second word
 * without its last character.
 *
 * Input:
 * apple banana
 * Output:
 * pple
 * banan
 */

public class RemoveFirstAndLastLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        System.out.println(word1.substring(1,word1.length()));
        System.out.println(word2.substring(0, word2.length() - 1));
    }
}
