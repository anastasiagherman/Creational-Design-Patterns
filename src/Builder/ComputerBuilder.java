package Builder;

public abstract class ComputerBuilder {
    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createNewComputer() {
        computer = new Computer();
    }

    public abstract void buildCPU();
    public abstract void buildOS();
    public abstract void buildBrand();

}
