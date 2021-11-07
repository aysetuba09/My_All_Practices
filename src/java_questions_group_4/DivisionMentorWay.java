package java_questions_group_4;

public class DivisionMentorWay {
    public static void divides(int num1, int num2) {

        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 +" divide by "+num2 +" is: ");

        int count =0;

        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
    }
}
