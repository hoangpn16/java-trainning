package creational.factory;

public class VietcomBank implements BankInterface {
    @Override
    public void getBankName() {
        System.out.println("VietcomBank");
    }
}
