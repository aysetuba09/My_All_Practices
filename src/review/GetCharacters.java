package review;

public class GetCharacters {
    public static  void getFromAToZ(){
        for (int i = 'A'; i < 'Z'; i++) {
            System.out.print((char)i + " ");// casting

        }
        System.out.println();
    }
    public static void getFrom9To0(){
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        getFromAToZ();
        getFrom9To0();
    }
}
