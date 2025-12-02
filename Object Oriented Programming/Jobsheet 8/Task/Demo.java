package Task;

public class Demo {
    public static void main(String[] args) {

        Guitar guitar1 = new Guitar("Acoustic Guitar", "Acoustic", 6);
        guitar1.printInfo();
        guitar1.playMethod();
        guitar1.playNote();

        System.out.println();

        Violin violin1 = new Violin("Violin", "Solid Wood", "Brown");
        violin1.printInfo();
        violin1.playMethod();
        violin1.playNote();
    }
}
