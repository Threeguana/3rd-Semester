package Task2;

public class SideCharacter extends Character implements IMage {

    private String race;

    public SideCharacter(String name, String element, String race) {
        super(name, element);
        this.race = race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Race    : " + getRace());
    }

    @Override
    public void castDefensiveMagic() {
        System.out.println(getName() + " shields themselves using ancient " + getRace() + " energy.");
    }

    @Override
    public void castOffensiveMagic() {
        System.out.println(getName() + " attacks with an ancient " + getRace() + " spell.");
    }
}
