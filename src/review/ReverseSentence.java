package review;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = s.nextLine();
        String [] words = str.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0 ; i--) {
            reversed += words[i] + " ";



        }
        System.out.println(reversed);
    }
}
