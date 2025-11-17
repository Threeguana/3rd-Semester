package Quiz2;

public abstract class Payment {

    private double amount;
    private String status;

    public Payment(double amount, String status) {
        this.amount = amount;
        this.status = status;
    }

    // Getters & Setters
    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Abstract method (must be implemented by subclass)
    public abstract void processTransaction();

    public void displayInfo() {
        System.out.println("Amount     : Rp " + amount);
        System.out.println("Status     : " + status);
    }
}
