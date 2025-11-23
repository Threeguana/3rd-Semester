public class Motorcycle extends Vehicle {
    private String type;
    private String color;

    // parameterized constructor
    public Motorcycle(String vehicleId, String brand, int productionYear, String type,
            String color) {
        super(vehicleId, brand, productionYear, 0); // daily rate default or set manually later
        this.type = type;
        this.color = color;
    }

    // getters
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getInfo() {
        return "Motorcycle [" + getBrand() + ", " + type + ", " + color + ", " + getProductionYear()
                + "]";
    }
}
