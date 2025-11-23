public class Customer {
    private String customerId;
    private String name;
    private String phoneNumber;

    // parameterized constructor
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // getters
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
