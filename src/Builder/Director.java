package Builder;

public class Director {
        private ComputerBuilder computerBuilder;
        public void setComputerBuilder(ComputerBuilder computerBuilder) {
            this.computerBuilder = computerBuilder;
        }

        public Computer getComputer() {
            return computerBuilder.getComputer();
        }
        public void constructComputer() {
            computerBuilder.createNewComputer();
            computerBuilder.buildCPU();
            computerBuilder.buildOS();
            computerBuilder.buildBrand();
        }
}
