package Task2;

public class Character {

    private String name;
    private String element;

    public Character(String name, String element) {
        this.name = name;
        this.element = element;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void showInfo() {
        System.out.println("Name    : " + getName());
        System.out.println("Element : " + getElement());
    }
}
