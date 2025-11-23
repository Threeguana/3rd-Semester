public class Main {
    public static void main(String[] args) {

        // Create customer
        Customer c1 = new Customer("C01", "Andini");
        c1.setPhoneNumber("081339567088");

        System.out.println("========= Customer Data =========");
        System.out.println("Customer ID : " + c1.getCustomerId());
        System.out.println("Name        : " + c1.getName());
        System.out.println("Phone       : " + c1.getPhoneNumber());
        System.out.println();

        // Polymorphism (Vehicle parent)
        Vehicle v1 = new Motorcycle("MTR01", "Yamaha", 2021, "Mio", "Black");
        Vehicle v2 = new Car("CAR01", "Honda", 2023, "Red", 4);
        Vehicle v3 = new Motorcycle("MTR02", "Yamaha", 2020, "Sport", "Blue");
        Vehicle v4 = new Car("CAR02", "Suzuki", 2023, "White", 2);

        // Composition demo
        Garage g1 = new Garage("Beta Garage");
        g1.addVehicle(v1);
        g1.addVehicle(v2);
        g1.addVehicle(v3);
        g1.addVehicle(v4);
        g1.displayVehicles();
        System.out.println();

        // Aggregation demo
        RentalContract contract1 =
                new RentalContract("R01", c1, v2, "2025-06-01", "2025-06-10", 5, 50000);

        contract1.printRentalInfo();
        System.out.println("Total Cost (Normal): Rp " + contract1.calculateTotalCost());
        System.out.println("Total Cost (Late by 2 days): Rp " + contract1.calculateTotalCost(2));
        System.out.println();

        // Overloading demo
        System.out.println("========= Vehicle Search =========");
        Vehicle result1 = g1.findVehicle("Honda");
        System.out.println("Result: " + (result1 != null ? result1.getInfo() : "Not found"));

        Vehicle result2 = g1.findVehicle("Yamaha", 2021);
        System.out.println("Result: " + (result2 != null ? result2.getInfo() : "Not found"));
    }
}
