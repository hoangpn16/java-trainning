package creational.builder;

public class StudentIpm implements StudentBuilder{
    protected String name;
    protected Integer age;
    @Override
    public StudentIpm setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentIpm setAge(Integer age) {
        this.age= age;
        return this;
    }
    public Student buid(){
        return new Student(name,age);
    }
}
