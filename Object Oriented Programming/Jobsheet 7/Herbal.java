public class Herbal extends Tanaman {
    private String manfaat;

    public Herbal() {
        super();
        this.manfaat = "belum diketahui";
    }

    public Herbal(String nama, String warna, int ukuran, String manfaat) {
        super(nama, warna, ukuran); // memanggil konstruktor si parent
        this.manfaat = manfaat;
    }

    public void setManfaat(String m) {
        this.manfaat = m;
    }

    public String getManfaat() {
        return manfaat;
    }

    public void menjadiObat() {
        System.out.println("Bermanfaat untuk " + manfaat);
    }

    //overiding
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Manfaat : " + manfaat);
    }
}
