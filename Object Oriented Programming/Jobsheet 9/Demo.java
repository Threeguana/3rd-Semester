public class Demo{
    public static void main(String[] args) {
        Kipas kps1 = new Kipas("Angin", 250000, "Putih", "Miyako");
        kps1.setJenis("Dinding");
        kps1.getInfo();

        System.out.println();

        Kulkas klk1 = new Kulkas(2, 3500000, "Silver", "Polytron");
        klk1.setHarga(3000000);
        klk1.setJmlPintu(2);
        klk1.getInfo();

        System.out.println();

        TV tv1 = new TV("LED", 15, 5000000, "Hitam", "Samsung");
        tv1.setJenisLayar("Oled");
        tv1.naikkanVolume(10);
        tv1.getInfo();

        System.out.println();

        SmartFridge sf1 = new SmartFridge(10, 8000000, "Abu-Abu", "LG");
        sf1.turunkanVolume(5);
        sf1.getInfo();
    }
}
