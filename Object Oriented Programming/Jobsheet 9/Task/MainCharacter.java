package Task;

public class MainCharacter extends Character implements ICharacter {

    private String power;

    public MainCharacter(String name, String gender, String power) {
        super(name, gender);
        this.power = power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Power   : " + getPower());
        speak();
    }

    @Override
    public void speak() {
        System.out.println("Says: I will save the world!");
    }
}
