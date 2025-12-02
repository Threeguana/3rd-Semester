public class AbstractClassDemo {
    public static void main(String[] args) {

        Bee queenBee = new Bee("Queen", 0.05, "Grass", "Savanna");
        queenBee.printInfo();
        queenBee.move();
        queenBee.breathe();

        System.out.println();

        Snake python = new Snake(true, 10, "Rat", "Rice Field");
        python.printInfo();
        python.move();
        python.breathe();
    }
}
