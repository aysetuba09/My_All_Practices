package review;

public class CountingNumbers {
    public static  void countNums(){
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");


        }
        System.out.println();
    }
    public static void countNums2(int n){
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");

        }
    }

    public static void main(String[] args) {
        countNums();
        countNums2(9);
    }
}
