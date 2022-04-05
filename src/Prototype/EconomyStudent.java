package Prototype;

public class EconomyStudent extends Student{

    public EconomyStudent(String name, int year, String status){
        super(name, year, status);
    }

    @Override
    public Student clone() {
        return new EconomyStudent(this.name, this.year, this.status);
    }

}
