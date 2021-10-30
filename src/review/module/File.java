package review.module;
/*
instance variables:
   - name (String)
   - size (double)

  constructor:
   - initialize all variables

  methods:
   - toString: print all the quiz information
   - openFile(): print: Opening $fileName
 */

public class File {
    String name;
    double size;

    public File(String name, double siz){
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
    public void openFile(){
        System.out.println("Opening " + name);
    }


}
