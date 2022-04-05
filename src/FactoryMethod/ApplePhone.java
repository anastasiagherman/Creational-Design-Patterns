package FactoryMethod;

public class ApplePhone implements Phone{
    @Override
    public void call() {
        System.out.println( "Apple Phone is calling........");
    }
}
