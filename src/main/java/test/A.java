package test;

public class A {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public A() {
        System.out.println("khoi tao A");
    }

    public void getExample(){
        System.out.println("Example");
    }
}
