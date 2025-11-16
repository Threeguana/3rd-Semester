package testpackage;

public class Employee {
    private String nip;
    private String name;
    private double salary;

    // Default constructor
    public Employee() {
        System.out.println("Employee object created");
    }

    // Constructor with parameters
    public Employee(String nip, String name, double salary) {
        this.nip = nip;
        this.name = name;
        this.salary = salary;
    }

    // Getter and setter methods (good OOP practice)
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Info method
    public String getInfo() {
        return "\nNIP    : " + nip + "\n"
             + "Name   : " + name + "\n"
             + "Salary : " + salary + "\n";
    }
}
