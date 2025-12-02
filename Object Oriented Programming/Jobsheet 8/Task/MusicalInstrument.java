package Task;

public abstract class MusicalInstrument { // superclass

    private String name;
    private String type;

    public MusicalInstrument(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Abstract methods – implemented by subclasses
    public abstract void playNote();

    public abstract void playMethod();

    public void printInfo() {
        System.out.println("--- Musical Instrument Information ---");
        System.out.println("Instrument Name : " + name);
        System.out.println("Instrument Type : " + type);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
