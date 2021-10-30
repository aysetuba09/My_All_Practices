package review.module;

public class TestModule {
    public static void main(String[] args) {
        Module day1 = new Module();
        File notes = new File("day1 notes", 0.4);
           day1.files.add(notes);
        System.out.println(day1.files.get(0));
        day1.files.get(0).openFile();
    }
}
