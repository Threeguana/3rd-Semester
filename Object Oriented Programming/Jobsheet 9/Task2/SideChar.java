package Task2;

public class SideChar extends Tokoh implements IPenyihir{
    private String ras;

    public SideChar(String nama, String elemen, String r){
        super(nama, elemen);
        this.ras = r;
    }

    public void setRas(String r){
        this.ras = r;
    }

    public String getRas(){
        return ras;
    }

    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Kekuatan: " + getRas());
    }

    public void sihirBertahan(){
        System.out.println(getNama() + " melindungi diri dengan energi magic ras " + getRas());
    }

    public void sihirSerang(){
        System.out.println(getNama() + " menyerang dengan mantra kuno ras " + getRas());
    }
}
