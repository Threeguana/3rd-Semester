public class Tanaman {
    private String nama;
    private String warna;
    private int ukuran;

    //konstruktor tanpa parameter (overloadin)
    public Tanaman() {
        this.nama = "";
        this.warna = "";
        this.ukuran = 0;
    }

    //konstruktor berparameter (overloading)
    public Tanaman(String n, String w, int u) {
        this.nama = n;
        this.warna = w;
        this.ukuran = u;
    }

    public void setNama(String n) {
        this.nama = n;
    }

    public String getNama() {
        return nama;
    }

    public void setWarna(String w) {
        this.warna = w;
    }

    public String getWarna() {
        return warna;
    }

    public void setUkuran(int u) {
        this.ukuran = u;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void disiram(){
        System.out.println("Menyiram tanaman " + nama);
    }

    //overriding
    public void displayInfo() {
        System.out.println(" ~~~~ INFORMASI TANAMAN ~~~~");
        System.out.println("Nama    : " + nama);
        System.out.println("Warna   : " + warna);
        System.out.println("Ukuran  : " + ukuran);
    }
}
