package Builder;

public class AppleComputerBuilder extends ComputerBuilder{

    public void buildCPU() {
        computer.setCpu("Intel");
    }

    public void buildOS() {
            computer.setOs("Android");
    }

    public void buildBrand() {

    }
}
