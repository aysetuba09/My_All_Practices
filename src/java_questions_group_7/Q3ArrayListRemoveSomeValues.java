package java_questions_group_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3ArrayListRemoveSomeValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter list of numbers");
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {

            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.removeIf(number -> (number>100));
        System.out.println("After removing number that their values are greater than 100");
        System.out.println(numbers);
    }
}
