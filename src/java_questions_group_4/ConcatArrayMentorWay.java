package java_questions_group_4;

public class ConcatArrayMentorWay {
    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for(int each: arr1) {
            result[i] = each;
            i++;
        }

        for(int each: arr2) {
            result[i] =each;
            i++;
        }

        return result;

    }

}
