public class MotorcycleDemo {
    public static void main(String[] args) {

        // Motor 1
        Motorcycle1 mtr1 = new Motorcycle1();
        mtr1.displayStatus();

        mtr1.setPlateNumber("B 0865 XZ");
        mtr1.setSpeed(120);
        mtr1.displayStatus();

        // Motor 2
        Motorcycle1 mtr2 = new Motorcycle1();
        mtr2.setPlateNumber("N 5678 AB");
        mtr2.setEngineOn(true);
        mtr2.setSpeed(40);
        mtr2.displayStatus();

        // Motor 3
        Motorcycle1 mtr3 = new Motorcycle1();
        mtr3.setPlateNumber("D 0865 CV");
        mtr3.setEngineOn(true); // fixed: was calling mtr2 by mistake
        mtr3.setSpeed(-60); // assuming your motorcycle handles invalid speed
        mtr3.displayStatus();
    }
}
