public class Demo {
    public static void main(String[] args) {
        Herbal h1 = new Herbal();
        h1.setNama("Jahe");
        h1.setWarna("Merah muda");
        h1.setManfaat("Meredakan radang");
        h1.setUkuran(20);

        h1.displayInfo();
        h1.disiram();
        h1.menjadiObat();
    }
}
