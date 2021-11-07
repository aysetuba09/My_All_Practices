package java_questions_group_3;
/*
Given an array of 3 characters print all permutation combinations from the given characters.


 */

public class Q4Permutation {
    public static void main(String[] args) {
        char [] arr = { 'a', 'b', 'c'};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                      if(arr[i] != arr[j] && arr[i] != arr[k] && arr[j] != arr[k] ){
                          System.out.println("" + arr[i] + arr[j] + arr[k]);
                      }
                }

            }
        }
    }
}
