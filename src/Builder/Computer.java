package Builder;

public class Computer {
    private String cpu;
    private String os;
    private String brand;


    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void info() {
        System.out.println("This computer is " + brand + " with " + cpu + " CPU and " + os + " operating system!");
    }

}
