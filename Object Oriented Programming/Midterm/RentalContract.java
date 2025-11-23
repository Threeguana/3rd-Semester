public class RentalContract {
    private Customer customer;
    private Vehicle vehicle;
    private String contractId;
    private String startDate;
    private String endDate;
    private int rentalDays; // in days
    private double penaltyPerDay;

    // parameterized constructor
    public RentalContract(String contractId, Customer customer, Vehicle vehicle, String startDate,
            String endDate, int rentalDays, double penaltyPerDay) {
        this.contractId = contractId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentalDays = rentalDays;
        this.penaltyPerDay = penaltyPerDay;
    }

    // getters
    public String getContractId() {
        return contractId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getPenaltyPerDay() {
        return penaltyPerDay;
    }

    // calculate normal rental cost
    public double calculateTotalCost() {
        return vehicle.getDailyRate() * rentalDays;
    }

    // overloading: calculate with late return
    public double calculateTotalCost(long lateDays) {
        return calculateTotalCost() + (lateDays * penaltyPerDay);
    }

    public void printRentalInfo() {
        System.out.println("========= Rental Contract Details =========");
        System.out.println(customer.getName() + " rented " + vehicle.getInfo());
        System.out.println("Contract ID     : " + contractId);
        System.out.println("Start Date      : " + startDate);
        System.out.println("End Date        : " + endDate);
        System.out.println("Rental Duration : " + rentalDays + " days");
        System.out.println("Total Price     : Rp " + calculateTotalCost());
        System.out.println("Penalty / Day   : Rp " + penaltyPerDay);
        System.out.println("===========================================");
    }
}
