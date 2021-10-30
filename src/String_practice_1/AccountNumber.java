package String_practice_1;

import java.util.Scanner;

public class AccountNumber {
    /*
    [Account Number]
    Declare a variable account number (String). You will check if these account numbers are valid.
    -If the account number begins with a “2” the account number should be 7 characters longPrint: "Valid 7-digit account number"Otherwise: "Invalid 7-digit account number"
    -If the account number begins with a “5” the account number should be 10 characters longPrint: "Valid 5-digit account number"Otherwise: "Invalid 5-digit account number"
    -If the account number does not begin with a 2 or a 5Print "Invalid account number"
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter account number");
        String acc = s.next();
        if(acc.startsWith("2")){
            if(acc.length() == 7){
                System.out.println("Valid 7-digit account number");
            }else{
                System.out.println( "Invalid 7-digit account number");
            }
        }else if(acc.startsWith("5")){
            if(acc.length() == 10) {
                System.out.println( "Valid 5-digit account number");
            }else{
                System.out.println( "Invalid 5-digit account number");
            }
        }else{
            System.out.println("Invalid account number");
        }
    }
}
