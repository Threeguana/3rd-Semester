package Task2;

public class MainChar extends Tokoh implements IPetarung, IPenyihir{
    private String senjata;

    public MainChar(String nama, String elemen, String s){
        super(nama, elemen);
        this.senjata = s;
    }

    public void setSenjata(String s){
        this.senjata = s;
    }

    public String getSenjata(){
        return senjata;
    }

    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Kekuatan: " + getSenjata());
    }

    @Override
    public void sihirBertahan(){
        System.out.println(getNama() + " menciptakan perisai elemen " + getElemen());
    }

    @Override
    public void sihirSerang(){
        System.out.println(getNama() + " menyerang dengan sihir " + getElemen());
    }

    @Override
    public void bertahanFisik(){
        System.out.println(getNama() + " menangkis serangan dengan " + getSenjata());
    }

    @Override
    public void serangFisik(){
        System.out.println(getNama() + " menyerang menggunakan " + getSenjata());
    }
}
