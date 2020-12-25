package creational.factory;

public class BankFactory {
    public BankInterface getBank(String type){
        if(type.equals("TPBank")){
            return new TPBank();
        }
        if(type.equals("VietcomBank")){
            return new VietcomBank();
        }
        return null;
    }
}
