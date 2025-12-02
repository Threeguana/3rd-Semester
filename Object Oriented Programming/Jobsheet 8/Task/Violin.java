package Task;

public class Violin extends MusicalInstrument {

    private String color;

    public Violin(String name, String type, String color) {
        super(name, type);
        this.color = color;
    }

    @Override
    public void playNote() {
        System.out.println("Playing violin notes: the four basic strings (G, D, A, E)");
        System.out.println("Can perform scales to create melodies.");
    }

    @Override
    public void playMethod() {
        System.out.println("The violin can be played by plucking or bowing the strings.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Instrument Color : " + color);
    }

    public String getColor() {
        return color;
    }
}
