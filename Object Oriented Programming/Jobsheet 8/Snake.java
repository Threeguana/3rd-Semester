public class Snake extends Animal {

    private boolean venomous;

    public Snake(boolean venomous, double weight, String food, String habitat) {
        super(weight, food, habitat);
        this.venomous = venomous;
    }

    @Override
    public void move() {
        System.out.println("Using muscles on all sides to create wave-like motion...");
        System.out.println("Using its backbone as a leverage point...");
        System.out.println("Pushing against the ground with belly scales...");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing using lungs...");
        System.out.println("Rib muscles relax, allowing air to enter the lungs...");
        System.out.println("Rib muscles contract, pushing air out...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Venomous : " + (venomous ? "Yes" : "No"));
    }
}
