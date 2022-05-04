package Prototype;

public abstract class Student {
    protected String name;
    protected int year;
    protected String status;

    public Student(String name, int year, String status) {
        this.name = name;
        this.year = year;
        this.status = status;
    }

    public void setName(String name){
        this.name = name;
    }

    public String  getName() {
        return name;
    }

    public int getYear(){
        return year;
    }

    public String getStatus(){
        return status;
    }
    public abstract Student clone();
}


