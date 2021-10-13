package java_questions_group_2;

public class PasswordValidation {
    /*Q7:String -- Password Validation Task 1: Write a return method that can verify if a password is valid or not.
Requirements:
 1. Password MUST be at least have 6 characters and should not contain space.
 2. Password should at least contain one upper case letter
 3. Password should at least contain one lowercase letter
 4. Password should at least contain one special characters
 5. Password should at least contain a digit if all requirements above are met, the method returns true, otherwise returns false
*/

    public static boolean validation(String password) { // boolean bc valid or not  so return type is also boolean // param is String bc password looks like "1232ndks"

        if (password.length() < 6 && !password.contains(" ")) {//length() is string method
return false;
        }else {
            int upper = 0;
            int lower = 0;
            int special = 0;
            int digit = 0;
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) < 'z' && password.charAt(i) > 'a') {
lower++;

                }
                if (password.charAt(i) < 'Z' && password.charAt(i) > 'A') {
upper++;
                }
                if (password.charAt(i) < '/' && password.charAt(i) > '!' || password.charAt(i) < '@' && password.charAt(i) > ':' || password.charAt(i) < '`' && password.charAt(i) > '[' || password.charAt(i) < '~' && password.charAt(i) > '{') { // look at the ascii values link https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
special++;
                }
                if (password.charAt(i) < '9' && password.charAt(i) > '0') {
digit++;
                }


            }
            return upper > 0 && lower > 0 && special > 0 && digit > 0;
        }


        }




    public static void main(String[] args) {
        System.out.println(validation("A1wdAj"));
    }
}
