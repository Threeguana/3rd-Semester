package Task;

public class Demo {
    public static void main(String[] args) {

        MainCharacter hero = new MainCharacter("Petra", "Male", "Unknown");
        hero.setPower("Chrono Rift");
        hero.showInfo();

        System.out.println();

        Antagonist enemy = new Antagonist("Anya", "Unknown", "Unknown");
        enemy.setGender("Female");
        enemy.setFaction("Eclipse Order");
        enemy.showInfo();
    }
}
