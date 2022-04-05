package Prototype;

public class Main {
    public static void main(String[] args) {
        Student alisa = new EconomyStudent("Alisa", 4, "buget");
        Student maria = alisa.clone();
        maria.setName("Maria");
        Student ion = new LawStudent("Ion", 2, "contract");
        Student elena = ion.clone();
        elena.setName("Elena");
        System.out.println(alisa.getName());
        System.out.println(maria.getName());
        System.out.println(ion.getName());
        System.out.println(elena.getName());
    }
}
