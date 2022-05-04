package FactoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GetPhoneFactory phoneFactory = new GetPhoneFactory();
        System.out.println("Enter the name of the phone");
        Scanner input = new Scanner(System.in);
        String phoneName = input.next();
        Phone phone1 = phoneFactory.getPhone(phoneName);
        phone1.call();
    }
}
