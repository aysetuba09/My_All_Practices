package java_questions_group_3;
/*
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)


 */

import java.util.ArrayList;
import java.util.Arrays;

public class Q5MoveZerosToTheEnd {
    public static int[] moveZeros( int[]  arr ) {

        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {

            list.add(each);

            countZero+= (each==0)?1:0;

        }



        list.removeAll(Arrays.asList(0));

        arr = new int[arr.length];

        for(int i=0; i <arr.length-countZero; i++ ) {

            arr[i] = list.get(i);

        }

        return arr;

    }

}
