package String_practice_1;
/*

Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
         If it is less print: "Password cannot be less than 5 characters"
         If it is more than or equal to 5 print: "Valid password"

    - Also, the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
             Also change the password to have the value: "password"
 */

import java.util.Scanner;

public class UsernameAndPassword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = s.next();
        System.out.println("Enter your password");
        String password = s.next();
        if(password.length() >= 5 && !password.contains(username)){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
            if(password.length() < 5){
                System.out.println("Password cannot be less than 5 characters");

            }if(password.contains(username)){
                System.out.println("Invalid password, username should not be in it");
            }
        }
    }
}
