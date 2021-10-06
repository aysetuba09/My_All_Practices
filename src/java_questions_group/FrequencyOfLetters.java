package java_questions_group;

public class FrequencyOfLetters {
    public static int frequencyOfLetter(String word, char c){
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {

            if(word.charAt(i) == c) {
                counter++;
            }

        }
        System.out.print(c);
        return counter;
    }

    public static void main(String[] args) {

        System.out.print(frequencyOfLetter("aaabbbcccddd", 'a'));
        System.out.print(frequencyOfLetter("aaabbbcccddd", 'b'));
        System.out.print(frequencyOfLetter("aaabbbcccddd", 'c'));
        System.out.print(frequencyOfLetter("aaabbbcccddd", 'd'));
    }
}
