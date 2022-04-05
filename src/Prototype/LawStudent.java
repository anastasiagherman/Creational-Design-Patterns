package Prototype;

public class LawStudent extends Student{
    public LawStudent(String name, int year, String status){
        super(name, year, status);
    }

    @Override
    public Student clone() {
        return new LawStudent(this.name, this.year, this.status);
    }

}
