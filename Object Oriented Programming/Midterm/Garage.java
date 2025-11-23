import java.util.ArrayList;

public class Garage {
    private String garageName;
    private ArrayList<Vehicle> vehicles; // composition: a garage owns vehicles

    // constructor
    public Garage(String garageName) {
        this.garageName = garageName;
        this.vehicles = new ArrayList<>();
    }

    // add a vehicle to the garage
    public void addVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicles.add(vehicle);
        }
    }

    // display all vehicles
    public void displayVehicles() {
        System.out.println("========= Vehicles in Garage: " + garageName + " =========");
        for (Vehicle v : vehicles) {
            System.out.println(v.getInfo());
        }
    }

    // overloading: search by brand
    public Vehicle findVehicle(String brand) {
        for (Vehicle v : vehicles) {
            if (v.getBrand().equalsIgnoreCase(brand)) {
                return v;
            }
        }
        return null;
    }

    // overloading: search by brand and production year
    public Vehicle findVehicle(String brand, int productionYear) {
        for (Vehicle v : vehicles) {
            if (v.getBrand().equalsIgnoreCase(brand)
                    && v.getProductionYear() == productionYear) {

                return v;
            }
        }
        return null;
    }
}
