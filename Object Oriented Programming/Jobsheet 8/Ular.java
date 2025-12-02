public class Ular extends Hewan{
    public boolean isBerbisa;

    public Ular(boolean isBerbisa, double berat, String makanan, String habitat){
        super(berat, makanan, habitat);
        this.isBerbisa = isBerbisa;
    }

    @Override
    public void bergerak() {
        System.out.println("Menggunakan otot dari segala sisi hingga membentuk gelombang");
        System.out.println("Menggunakan tulang belakang seperti batu loncatan");
        System.out.println("Menggunakan sisik perut untuk mendorong tubuh ke depan");
    }

    @Override
    public void bernapas() {
        System.out.println("Menggunakan paru-paru untuk bernapas");
        System.out.println("Otot tulang rusuk relaksasi, udara masuk ke paru-paru");
        System.out.println("Otot tulang rusuk relaksasi, udara keluar dari paru-paru");
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Berbisa : " + (isBerbisa ? "Ya" : "Tidak"));
    }
}
