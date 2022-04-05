package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new AndroidPhoneFactory().createPhone();
        phone1.call();
    }
}
