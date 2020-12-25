package creational.singleton;

public class TeacherService {
    private String name;
    private TeacherService(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private static TeacherService teacherService= new TeacherService();
    private static TeacherService getInstance(){
//        if(teacherService == null){
//            teacherService = new TeacherService();
//        }
        return teacherService;
    }
    public void getInfo()
    {
        System.out.println("The teacher'name is:"+this.name );
    }
}
