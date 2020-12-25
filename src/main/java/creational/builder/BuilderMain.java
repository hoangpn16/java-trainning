package creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Student a = new StudentIpm().setName("Hoang").buid();
        Student b = new StudentIpm().setAge(12).setName("Hung").buid();

        Student c = new Student("Hoang",12);

    }
}
