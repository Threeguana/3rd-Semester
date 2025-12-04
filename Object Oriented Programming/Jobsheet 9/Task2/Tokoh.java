package Task2;
public class Tokoh{
    private String nama;
    private String elemen;

    public Tokoh(String n, String e){
        this.nama = n;
        this.elemen = e;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setElemen(String elemen){
        this.elemen = elemen;
    }

    public String getElemen(){
        return elemen;
    }

    public void tampilInfo(){
        System.out.println("Nama   : " + getNama());
        System.out.println("Gender : " + getElemen());
    }
}
