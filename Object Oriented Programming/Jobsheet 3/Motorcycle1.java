public class Motorcycle1 {
    private String plateNumber;
    private boolean engineOn;
    private int speed;

    // Show current state
    public void displayStatus() {
        System.out.println("Plate Number : " + plateNumber);
        System.out.println("Engine       : " + (engineOn ? "ON" : "OFF"));
        System.out.println("Speed        : " + speed);
        System.out.println("===========================");
    }

    // Getters
    public String getPlateNumber() {
        return plateNumber;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public int getSpeed() {
        return speed;
    }

    // Setters
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;

        // If engine is turned off, speed should automatically drop to 0
        if (!engineOn) {
            this.speed = 0;
        }
    }

    public void setSpeed(int speed) {
        if (!engineOn && speed > 0) {
            System.out.println("\nCannot increase speed while engine is OFF.");
            return;
        }

        if (speed < 0) {
            System.out.println("\nSpeed cannot be negative.");
            return;
        }

        if (speed > 100) {
            System.out.println("\nMaximum speed is 100.");
            return;
        }

        this.speed = speed;
    }
}
