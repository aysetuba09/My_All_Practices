package java_questions_group_3;

import java.util.ArrayList;

public class SortDescendingMentorWay {
    public static int[] Sort(int[] a) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int each: a)

            list.add(each);



        for(int i=0; i < a.length; i++) {

            a[i] = findMax(list);

            list.remove(Integer.valueOf(a[i]));

        }

        return a;

    }



    public static int findMax(ArrayList<Integer> a) {

        int max=Integer.MIN_VALUE;

        for(int each: a)

            max = Math.max(max, each);

        return max;

    }



    //Solution 2:

    public static void SortingArrayDesc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for(int each: arr) {

            list.add(each);

        }

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

        for(int i=0; i < list.size(); i++) {

            arr[i] = list.get(i);

        }

    }
}
