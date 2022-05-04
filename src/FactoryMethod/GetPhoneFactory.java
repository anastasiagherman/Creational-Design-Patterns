package FactoryMethod;


public class GetPhoneFactory {

    public Phone getPhone(String phoneType) {
        if (phoneType == null){
            return null;
        }
        if (phoneType.equalsIgnoreCase("Android")){
            return new AndroidPhone();
        }
        else if (phoneType.equalsIgnoreCase("Apple")){
            return new ApplePhone();
        }
        return null;

    }
}
