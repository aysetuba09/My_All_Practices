package review.module;
/*
create a class Module

  instance variables:
   - files (ArrayList of File objects)

  constructor:
   - no parameter -> create empty ArrayList object
   - initialize with given ArrayList of Files
    -> Use chaining

  methods:
   - toString: print all the quiz information
   - addFile(File): accept a File object and add the given File to the ArrayList
of Files of that module
- removeFile(File): accepts a File object and remove the given File from
the ArrayList of Files of that module
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Module {
    ArrayList<File>files;// reference is that store object files // reference part is in stack


    public Module(){
        files = new ArrayList<>();// set up my arraylist

    }
    public Module(ArrayList<File> files){
        this();
        this.files.addAll(files);
    }
    public void addFile (File [] note){
    files.addAll(Arrays.asList(note));

    }
    public void removeFile(String name){
        files.removeIf((each -> each.name.equals(name)));
    }
}
