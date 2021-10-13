package review;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ConvertName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = s.next();
        char [] nameInArray = name.toCharArray();
        System.out.println(Arrays.toString(nameInArray));
        System.out.println(name.toCharArray()[0]);// give first character
        char [] arr = {'f', 'r', 'o', 'g'};
        String str = new String(arr);
        System.out.println(str);
    }
}
