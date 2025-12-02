package Task;

public class Guitar extends MusicalInstrument {

    private int stringCount;

    public Guitar(String name, String type, int stringCount) {
        super(name, type);
        this.stringCount = stringCount;
    }

    @Override
    public void playNote() {
        System.out.println(
                "Standard guitar tuning: E - A - D - G - B - E (from thickest to thinnest string).");
    }

    @Override
    public void playMethod() {
        System.out.println("The guitar is played by plucking or strumming the strings.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Number of Strings : " + stringCount);
    }

    public int getStringCount() {
        return stringCount;
    }
}
