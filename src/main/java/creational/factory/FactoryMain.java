package creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        BankFactory bankFactory = new BankFactory();

        BankInterface tpBank= bankFactory.getBank("TPBank");
        tpBank.getBankName();

    }
}
