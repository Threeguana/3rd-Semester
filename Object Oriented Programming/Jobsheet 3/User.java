public class User {
    private String username;
    private String name;
    private String email;
    private String address;
    private String job;

    // Public constructor
    public User(String username, String name, String email) {
        this.username = username;
        this.name = name;
        this.email = email;
    }

    // Setters
    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    // Print info
    public void printInfo() {
        System.out.println("Username  : " + username);
        System.out.println("Name      : " + name);
        System.out.println("Email     : " + email);
        System.out.println("Address   : " + address);
        System.out.println("Job       : " + job);
        System.out.println("===========================");
    }
}
