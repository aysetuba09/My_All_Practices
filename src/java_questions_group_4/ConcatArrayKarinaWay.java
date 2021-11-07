package java_questions_group_4;

import java.util.ArrayList;

public class ConcatArrayKarinaWay {
    public static void main(String[] args) {

        String [] arr1 = {"f","o","o"};
        String [] arr2 = {"b","a","r"};

        System.out.println(combinedArray(arr1,arr2));
    }

    static public ArrayList<String> combinedArray (String [] arr1, String [] arr2){

        ArrayList<String> newList = new ArrayList<>();
        for(String each : arr1){
            newList.add(each);
        }

        for(String each : arr2){
            newList.add(each);
        }

        return newList;

    }

}
