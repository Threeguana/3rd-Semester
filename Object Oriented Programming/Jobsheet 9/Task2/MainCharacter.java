package Task2;

public class MainCharacter extends Character implements IWarrior, IMage {

    private String weapon;

    public MainCharacter(String name, String element, String weapon) {
        super(name, element);
        this.weapon = weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weapon  : " + getWeapon());
    }

    // ----- Magic abilities -----

    @Override
    public void castDefensiveMagic() {
        System.out.println(getName() + " conjures a " + getElement() + " barrier!");
    }

    @Override
    public void castOffensiveMagic() {
        System.out.println(getName() + " unleashes a " + getElement() + " magic attack!");
    }

    // ----- Physical abilities -----

    @Override
    public void defendPhysical() {
        System.out.println(getName() + " blocks the attack using " + getWeapon() + ".");
    }

    @Override
    public void attackPhysical() {
        System.out.println(getName() + " strikes with " + getWeapon() + "!");
    }
}
