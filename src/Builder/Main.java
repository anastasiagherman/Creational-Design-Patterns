package Builder;

public class Main {
    public static void main(String[] args){
        Director creator=new Director();
        ComputerBuilder appleBuilder=new AppleComputerBuilder();
        creator.setComputerBuilder(appleBuilder);
        creator.constructComputer();
        Computer computer = creator.getComputer();
        computer.info();
    }
}
