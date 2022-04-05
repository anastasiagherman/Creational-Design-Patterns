package Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton.getInstance(8000);
        Singleton.getInstance(4000);


        Transactions.transactions();

        Transactions.balance();
    }
}
