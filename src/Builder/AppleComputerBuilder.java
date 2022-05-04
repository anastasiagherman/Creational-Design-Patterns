package Builder;

public class AppleComputerBuilder extends ComputerBuilder{

    public void buildCPU() {
        computer.setCpu("Intel");
    }

    public void buildOS() {
            computer.setOs("MacOS");
    }

    public void buildBrand() {
        computer.setBrand("Apple");

    }
}
