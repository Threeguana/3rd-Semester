public class Herbal extends Plant {
    private String benefit;

    public Herbal() {
        super();
        this.benefit = "unknown";
    }

    public Herbal(String name, String color, int size, String benefit) {
        super(name, color, size);
        this.benefit = benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getBenefit() {
        return benefit;
    }

    public void convertToMedicine() {
        System.out.println("Useful for: " + benefit);
    }

    // Overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Benefit: " + benefit);
    }
}
