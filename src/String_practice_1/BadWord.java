package String_practice_1;

import java.util.Locale;
import java.util.Scanner;

public class BadWord {
    /*
    [Bad Word]Given a String variable with a message. You will check if the message contains any of these bad words: “idiot, dumb, heck”If the message contains any of those words print: “Message not sent”. If the message is bad word free print “Message sent”
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your message");
        String msg = s.nextLine();
        msg = msg.toLowerCase(Locale.ROOT);
        if(msg.contains("idiot") || msg.contains("dumb") || msg.contains("heck")){
            System.out.println("Message not sent");
        }else{
            System.out.println("Message sent");
        }
    }
}
