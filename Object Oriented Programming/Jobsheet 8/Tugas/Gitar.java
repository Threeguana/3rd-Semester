package Tugas;

public class Gitar extends AlatMusik{
    public int jmlSenar;

    public Gitar(String n, String j, int jmlS){
        super(n, j);
        this.jmlSenar = jmlS;
    }

    @Override
    public void nada(){
        System.out.println("Nada dasar standar gitar adalah (E-A-D-G-B-E) dari senar tebal ke tipis");
    }

    @Override
    public void caraMain(){
        System.out.println("Dimainkan dengan cara dipetik");
    }

    public void info(){
        super.info();
        System.out.println("Jumlah senar : " + this.jmlSenar);
    }
}
