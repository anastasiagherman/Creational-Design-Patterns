package Builder;

public class Main {
    public static void main(String[] args){
        ComputerMaker creator=new ComputerMaker();
        ComputerBuilder appleBuilder=new AppleComputerBuilder();
        creator.setPhoneBuilder(appleBuilder);
        creator.constructPhone();
        Computer computer = creator.getComputer();
        computer.info();
    }
}
