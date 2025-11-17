package Quiz2;

public class CreditCard extends Payment implements IAuthentication {

    private String ownerName;
    private double creditLimit;
    private boolean isVerified;

    public CreditCard(double amount, String status, String ownerName, double creditLimit) {
        super(amount, status);
        this.ownerName = ownerName;
        this.creditLimit = creditLimit;
        this.isVerified = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n--- Credit Card Information ---");
        System.out.println("Owner Name  : " + ownerName);
        System.out.println("Credit Limit: Rp " + creditLimit);
        super.displayInfo();
        System.out.println("--------------------------------");
    }

    @Override
    public void verifyIdentity() {
        System.out.println("Verifying credit card owner: " + ownerName);

        if (!getStatus().equalsIgnoreCase("Active")) {
            isVerified = false;
            System.out.println("Verification failed: Card is inactive!");
            return;
        }

        isVerified = true;
        System.out.println("Verification successful.");
    }

    @Override
    public void processTransaction() {
        System.out.println("\nProcessing Credit Card Transaction...");

        if (!isVerified) {
            setStatus("Failed");
            System.out.println("Transaction cancelled due to failed verification.");
            return;
        }

        if (getAmount() <= creditLimit) {
            creditLimit -= getAmount();
            setStatus("Success");
            System.out.println("Transaction successful.");
            System.out.println("Remaining Credit Limit: Rp " + creditLimit);
        } else {
            setStatus("Failed");
            System.out.println("Transaction failed: Insufficient credit limit!");
        }

        System.out.println("--------------------------------");
    }
}
