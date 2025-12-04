public class Kulkas extends AlatElektronik{
    private int jmlPintu;

    public Kulkas(int jmlPintu, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jmlPintu = jmlPintu;
    }

    public void setJmlPintu(int jmlPintu){
        this.jmlPintu = jmlPintu;
    }

    public int getJmlPintu(){
        return jmlPintu;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Jumlah Pintu: " + getJmlPintu());
    }
}
