package review;

public class Duplicate {
    public static  String getDuplicate(String words, char letter){
        String duplicate = "";

        for (int i = 0; i < words.length(); i++) {
            int counter = 0;
            for (int j = 0; j < words.length(); j++) {
                if(words.charAt(i) == words.charAt(j)){
                    counter++;
                }

                }
            if(counter > 1){
                duplicate += words.charAt(i);
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {

        System.out.println(getDuplicate("apple", 'p'));
    }
}
