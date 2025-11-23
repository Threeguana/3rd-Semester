public abstract class Vehicle { // parent class
    private String vehicleId;
    private String brand;
    private int productionYear;
    private double dailyRate;

    // parameterized constructor
    public Vehicle(String id, String brand, int year, double dailyRate) {
        this.vehicleId = id;
        this.brand = brand;
        this.productionYear = year;
        this.dailyRate = dailyRate;
    }

    // getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    // method to be overridden
    public abstract String getInfo();
}
