public class Car extends Vehicle {
    private String color;
    private int seatCount;

    public Car(String vehicleId, String brand, int productionYear, String color, int seatCount) {
        super(vehicleId, brand, productionYear, 0); // set default daily rate if you want
        this.color = color;
        this.seatCount = seatCount;
    }

    // getters
    public String getColor() {
        return color;
    }

    public int getSeatCount() {
        return seatCount;
    }

    @Override
    public String getInfo() {
        return "Car [" + getBrand() + ", " + color + ", " + seatCount + " seats, "
                + getProductionYear() + "]";
    }
}
