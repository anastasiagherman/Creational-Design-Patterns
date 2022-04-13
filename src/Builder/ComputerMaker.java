package Builder;

public class ComputerMaker {
        private ComputerBuilder computerBuilder;
        public void setPhoneBuilder(ComputerBuilder computerBuilder) {
            this.computerBuilder = computerBuilder;
        }

        public Computer getComputer() {
            return computerBuilder.getComputer();
        }
        public void constructPhone() {
            computerBuilder.createNewComputer();
            computerBuilder.buildCPU();
            computerBuilder.buildOS();
            computerBuilder.buildBrand();
        }
}
