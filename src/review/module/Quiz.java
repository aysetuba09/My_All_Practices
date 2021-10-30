package review.module;
/*
create a class Quiz

  instance variables:
   - topic (String)
   - total number of questions (int)
   - total points (double)

  constructor:
   - initialize all variables

  methods:
   - toString: print all the quiz information
   - takeQuiz(): print: Taking the $topic quiz
 */

public class Quiz {
    String topic;
    int totalNumberOfQuestions;
    double totalPoints;
    public Quiz(String topic, int totalNumberOfQuestions,double totalPoints){
        this.topic = topic;
        this.totalNumberOfQuestions = totalNumberOfQuestions;
        this.totalPoints = totalPoints;



    }

    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", totalNumberOfQuestions=" + totalNumberOfQuestions +
                ", totalPoints=" + totalPoints +
                '}';
    }
    public void takeQuiz(){
        System.out.println("Taking the " + topic + " quiz");
    }
}
