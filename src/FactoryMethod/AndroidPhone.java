package FactoryMethod;

public class AndroidPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Android Phone is calling......");
    }
}
