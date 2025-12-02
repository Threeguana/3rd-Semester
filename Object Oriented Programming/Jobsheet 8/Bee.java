public class Bee extends Animal {

    private String caste;

    public Bee(String caste, double weight, String food, String habitat) {
        super(weight, food, habitat);
        this.caste = caste;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Caste    : " + caste);
    }

    @Override
    public void breathe() {
        System.out
                .println("Abdominal muscles relax, allowing air to enter through body spiracles.");
        System.out.println("The trachea delivers oxygen throughout the body.");
        System.out.println("Abdominal muscles contract, pushing air out.");
    }

    @Override
    public void move() {
        System.out.println("Flapping wings forward...");
        System.out.println("Rotating wings nearly 90 degrees...");
        System.out.println("Flapping wings backward...");
    }
}
