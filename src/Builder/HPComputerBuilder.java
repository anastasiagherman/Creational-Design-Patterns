package Builder;

public class HPComputerBuilder extends ComputerBuilder {
    public void buildCPU() {
        computer.setCpu("Intel");
    }
    public void buildOS() {
        computer.setOs("Linux");
    }
    public void buildBrand() {
        computer.setBrand("HP");
    }
}
