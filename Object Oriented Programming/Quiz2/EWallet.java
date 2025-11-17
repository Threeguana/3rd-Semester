package Quiz2;

public class EWallet extends Payment implements IAuthentication, IReceiptPrinter {

    private String accountName;
    private double balance;
    private boolean isVerified;

    public EWallet(double amount, String status, String accountName, double balance) {
        super(amount, status);
        this.accountName = accountName;
        this.balance = balance;
        this.isVerified = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n--- E-Wallet Account Info ---");
        System.out.println("Account Name : " + accountName);
        System.out.println("Balance      : Rp " + balance);
        super.displayInfo();
        System.out.println("------------------------------");
    }

    @Override
    public void verifyIdentity() {
        System.out.println("Verifying account: " + accountName);

        if (!getStatus().equalsIgnoreCase("Active")) {
            isVerified = false;
            System.out.println("Verification failed: Account is not active!");
            return;
        }

        int pin = (int) (getAmount() % 10); // get last digit of amount

        if (pin % 2 == 0) {
            isVerified = true;
            System.out.println("Verification successful.");
        } else {
            isVerified = false;
            System.out.println("Verification failed!");
        }
    }

    @Override
    public void processTransaction() {
        System.out.println("Processing E-Wallet transaction...");

        if (!isVerified) {
            setStatus("Failed");
            System.out.println("Transaction cancelled due to failed verification.");
            return;
        }

        if (balance >= getAmount()) {
            balance -= getAmount();
            setStatus("Success");
            System.out.println("Transaction completed successfully.");
        } else {
            setStatus("Failed");
            System.out.println("Transaction failed: Insufficient balance!");
        }

        printReceipt();
    }

    @Override
    public void printReceipt() {
        System.out.println("\n------- E-Wallet Receipt -------");
        System.out.println("Account Name : " + accountName);
        System.out.println("Amount       : Rp " + getAmount());
        System.out.println("Remaining Bal: Rp " + balance);
        System.out.println("--------------------------------\n");
    }
}
