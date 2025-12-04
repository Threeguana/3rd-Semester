package Task;

public class Character {

    private String name;
    private String gender;

    public Character(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void showInfo() {
        System.out.println("Name   : " + getName());
        System.out.println("Gender : " + getGender());
    }
}
