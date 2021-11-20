package java_questions_group_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2ArrayListRemoveAhmed {
    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"....Write a java operation to remove all the names named Ahmed

     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("Tuba");
        names.add("Sarah");
        names.add("Ahmed");
        names.add("Ahmed");
        names.add("Fatih");
        System.out.println(names);

     names.removeIf(name -> name.equals("Ahmed"));
        System.out.println(names);



    }
}
