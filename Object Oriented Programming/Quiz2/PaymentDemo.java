package Quiz2;

public class PaymentDemo {
    public static void main(String[] args) {

        // Successful e-wallet transaction
        EWallet customer1 = new EWallet(100000, "Active", "Andini", 300000);
        customer1.verifyIdentity();
        customer1.displayInfo();
        customer1.processTransaction();

        // Failed e-wallet transaction (example)
        // EWallet customer2 = new EWallet(2223, "Inactive", "Tribuana", 40000);
        // customer2.verifyIdentity();
        // customer2.displayInfo();
        // customer2.processTransaction();

        // Successful credit card transaction (example)
        // CreditCard cc1 = new CreditCard(20000, "Active", "Budi Tabudi", 100000);
        // cc1.verifyIdentity();
        // cc1.displayInfo();
        // cc1.processTransaction();

        // Failed credit card transaction (example)
        // CreditCard cc2 = new CreditCard(2000000, "Active", "Caca", 100000);
        // cc2.verifyIdentity();
        // cc2.displayInfo();
        // cc2.processTransaction();
    }
}
