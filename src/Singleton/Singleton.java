package Singleton;

public class Singleton {
    private static Singleton instance;
    private static Bank bank;


    private Singleton(int value){
        bank = new Bank(value);
    }
    private Singleton(){}
    public static Singleton getInstance(int value) {
        if (instance == null){
            instance = new Singleton(value);
        }
        if (bank == null){
            bank = new Bank(value);
        }
        return  instance;
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void deposit(int value) {
        bank.setTotal(bank.getTotal() + value);
    }

    public void withdraw(int value) {
        bank.setTotal(bank.getTotal() - value);
    }

    public Bank getBank() {
        return bank;
    }
}
