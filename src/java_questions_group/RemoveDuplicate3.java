package java_questions_group;
import java.util.Scanner;

public class RemoveDuplicate3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){
        String noDuplicates = "";
        for (int i = 0; i < str.length(); i++){
            if (!noDuplicates.contains(str.charAt(i)+"")){noDuplicates += str.charAt(i);}
        }
        String result = "";
        int count = 0;
        for (int i = 0; i < noDuplicates.length(); i++){
            count =0;
            for (int j = 0; j < str.length(); j++){
                if (noDuplicates.charAt(i) == str.charAt(j)){ count++;}
            }
            result +=count + "" + noDuplicates.charAt(i);

        }



        return result;
    }


}
