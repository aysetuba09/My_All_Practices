package review;

import java.util.Scanner;

public class SplitReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your sentence just 3 words");
        String str = s.nextLine();
        s.close();
        String [] words = str.split(" ");
        String reversed = "";
        for (int i = words[1].length() - 1; i >= 0; i--) {
            reversed += words[1].charAt(i);// charAt() read each character do not forget

        }
        System.out.println(words[0] + " " + reversed + " " + words[2]);
    }
}
