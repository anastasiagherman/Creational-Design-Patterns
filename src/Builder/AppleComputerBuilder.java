package Builder;

public class AppleComputerBuilder extends ComputerBuilder{

    @Override
    public void buildCPU() {
        computer.setCpu("Intel");
    }

    @Override
    public void buildOS() {
            computer.setOs("Android");
    }

    @Override
    public void buildBrand() {

    }
}
