package Tugas;

public class Biola extends AlatMusik{
    public String warna;

    public Biola(String n, String j, String w){
        super(n, j);
        this.warna = w;
    }

    @Override
    public void nada(){
        System.out.println("Nada dasar empat senar biola (G, D, A, E) dan tangga nada yang dapat dimainkan untuk membuat melodi");
    }

    @Override
    public void caraMain(){
        System.out.println("Dapat dimainkan dengan cara dipetik dan digesek");
    }

    public void info(){
        super.info();
        System.out.println("Warna alat : " + this.warna);
    }
}
