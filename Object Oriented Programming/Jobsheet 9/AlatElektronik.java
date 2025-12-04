public class AlatElektronik {
    private double harga;
    private String warna;
    private String merk;

    public AlatElektronik(double h, String w, String m){
        this.harga = h;
        this.warna = w;
        this.merk = m;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public String getWarna(){
        return warna; 
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void getInfo(){
        System.out.println("Merk  : " + merk);
        System.out.println("warna : " + warna);
        System.out.println("Harga : " + harga);
    }
}
