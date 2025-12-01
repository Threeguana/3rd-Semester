public class Plant {
    private String name;
    private String color;
    private int size;

    // No-argument constructor
    public Plant() {
        this.name = "";
        this.color = "";
        this.size = 0;
    }

    // Constructor with parameters
    public Plant(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void water() {
        System.out.println("Watering plant: " + name);
    }

    // Overridable
    public void displayInfo() {
        System.out.println("~~~~ PLANT INFORMATION ~~~~");
        System.out.println("Name   : " + name);
        System.out.println("Color  : " + color);
        System.out.println("Size   : " + size);
    }
}
