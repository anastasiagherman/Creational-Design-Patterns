package Prototype;

public class Main {
    public static void main(String[] args) {
        Student alisa = new EconomyStudent("Alisa", 4, "buget");
        Student maria = alisa.clone();
        maria.setName("Maria");
        Student ion = new LawStudent("Ion", 2, "contract");
        Student elena = ion.clone();
        elena.setName("Elena");
        System.out.println("Economy students");
        System.out.println("Name: "+ alisa.getName() + " Year: " + alisa.getYear() + " Status: " + alisa.getStatus());
        System.out.println("Name: " + maria.getName() + " Year: " + maria.getYear() + " Status: " + maria.getStatus());
        System.out.println("Law students");
        System.out.println("Name " + ion.getName() + " Year: " + ion.getYear() + " Status: " + ion.getStatus());
        System.out.println("Name " + elena.getName() + "Year: " + elena.getYear() + " Status: " + elena.getStatus());
    }
}
