package creational.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        TeacherService.getInstance().setName("Phan Nho Hoang");
        TeacherService.getInstance().setName("Phan Nho Hoang123");
        TeacherService.getInstance().getInfo();

    }
}

