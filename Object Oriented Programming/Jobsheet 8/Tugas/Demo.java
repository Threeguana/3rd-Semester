package Tugas;

public class Demo {
    public static void main(String[] args) {
        Gitar gtr1 = new Gitar("Gitar", "Akustik", 6);
        gtr1.info();
        gtr1.caraMain();
        gtr1.nada();

        System.out.println();

        Biola bio1 = new Biola("Biola", "Kayu solid", "Coklat");
        bio1.info();
        bio1.caraMain();
        bio1.nada();
    }
}
