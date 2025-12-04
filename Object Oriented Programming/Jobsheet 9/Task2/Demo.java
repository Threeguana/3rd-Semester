package Task2;

public class Demo {
    public static void main(String[] args) {

        MainCharacter hero = new MainCharacter("Ares", "Fire", "Unknown");
        hero.setWeapon("Sword");
        hero.showInfo();
        hero.castOffensiveMagic();
        hero.attackPhysical();
        hero.castDefensiveMagic();
        hero.defendPhysical();

        System.out.println();

        SideCharacter mage = new SideCharacter("Lyra", "Wind", "Elf");
        mage.showInfo();
        mage.castOffensiveMagic();
        mage.castDefensiveMagic();
    }
}
