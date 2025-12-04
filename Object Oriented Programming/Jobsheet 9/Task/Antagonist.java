package Task;

public class Antagonist extends Character implements ICharacter {

    private String faction;

    public Antagonist(String name, String gender, String faction) {
        super(name, gender);
        this.faction = faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getFaction() {
        return faction;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Faction: " + getFaction());
        speak();
    }

    @Override
    public void speak() {
        System.out.println("Says: This world belongs to me!");
    }
}
