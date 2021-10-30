package review.module;
/*
create a class Canvas

  instance variables:
   - topic (String)
   - quizzes (ArrayList of Quiz objects)
   - modules (ArrayList of Module objects)

  constructor:
   - initialize topic
    -> create empty ArrayList objects for quizzes and modules
   - overload to accept the ArrayList of Quizzes and ArrayList of Module
    + chain the constructors
 Create a class UsingCanvas

  create an object of the Canvas and verify all the fields and methods can be
accessed and used
 */

import java.util.ArrayList;

public class Canvas {
    String topic;
    ArrayList<Quiz>quizzes; // = new Arraylist<>()
    ArrayList<Module>modules;
    public Canvas(String topic){// constructor
        this.topic =topic;//initialize
        quizzes = new ArrayList<>();
        modules = new ArrayList<>();


    }

    @Override
    public String toString() {
        return "Canvas{" +
                "topic='" + topic + '\'' +
                ", quizzes=" + quizzes +
                ", modules=" + modules +
                '}';
    }
}



