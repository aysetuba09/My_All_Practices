package String_practice_1;

import java.util.Locale;

public class Address {
    /*
    [Address]A person will enter their address into a String. Make sure the String is not empty. If it is empty print: "No address found".
If there is an address, make all the text uppercase to match the expected formatEx: Input: 231332leaf ave, lake city 3132Output: 231332 LEAFAVE, LAKE CITY 3132Ex: Input: ""Output: No address fou
     */
    public static void main(String[] args) {
        String address = "231332 leaf ave, lake city 3132";
        if(address.isEmpty()){
            System.out.println("No address found");
        }else{
            System.out.println(address.toUpperCase(Locale.ROOT));
        }
    }
}
