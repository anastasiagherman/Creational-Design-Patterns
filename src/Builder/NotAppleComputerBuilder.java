package Builder;

public class NotAppleComputerBuilder extends ComputerBuilder {
    @Override
    public void buildCPU() {
        computer.setCpu("Intel");
    }
    @Override
    public void buildOS() {
        computer.setOs("Linux");
    }
    @Override
    public void buildBrand() {
        computer.setBrand("HP");
    }
}
