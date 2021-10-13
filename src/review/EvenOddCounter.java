package review;

public class EvenOddCounter {
    public static void main(String[] args) {
        int [] nums = { 1, 2, 3, 4, 7, 4,};
        int even = 0;
        int odd = 0;
        String evenN = "";
        String oddN = "";
        for(int each : nums){
            if(each%2 == 0){
                even++;
                evenN += each + " ";

            }
            if(each%2 == 1){
                odd++;
                oddN += each + " ";
            }
        }
        System.out.println("odd = " + odd);
        System.out.println("oddN = " + oddN);
        System.out.println("even = " + even);
        System.out.println("evenN = " + evenN);
    }
}
