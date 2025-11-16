package inheritance;

import testpackage.Employee;

public class Lecturer extends Employee {
    private String nidn;

    // Default constructor
    public Lecturer() {
        System.out.println("Lecturer object created");
    }

    // Constructor with parameters
    public Lecturer(String nip, String name, double salary, String nidn) {
        super(nip, name, salary);
        this.nidn = nidn;
        System.out.println("Lecturer object created with parameters");
    }

    // Method to get complete info including parent
    public String getAllInfo() {
        String info = super.getInfo();
        info += getInfo();
        return info;
    }

    // Method to get Lecturer-specific info
    public String getInfo() {
        return "NIDN   : " + this.nidn + "\n";
    }
}
