package Task2;

public class Demo {
    public static void main(String[] args) {
        MainChar hero = new MainChar("Ares", "Api", "unknown");
        hero.setSenjata("Pedang");
        hero.tampilInfo();
        hero.sihirSerang();
        hero.serangFisik();
        hero.sihirBertahan();
        hero.bertahanFisik();

        System.out.println();

        SideChar mage = new SideChar("Lyra", "Angin", "Elf");
        mage.tampilInfo();
        mage.sihirSerang();
        mage.sihirBertahan();
    }
}
