package Tugas;
public abstract class AlatMusik{ //superclass
    public String nama;
    public String jenis;

    public AlatMusik(String n, String j){
        this.nama = n;
        this.jenis = j;
    }

    public abstract void nada(); //abstract method
    public abstract void caraMain(); //abstract method
    public void info(){
        System.out.println("--- Informasi Alat Musik ---");
        System.out.println("Nama alat  : " + nama);
        System.out.println("Jenis alat : " + jenis);
    }
}
