public abstract class Hewan {
    public double berat;
    public String makanan;
    public String habitat;

    public Hewan(double b, String m, String h){
        this.berat = b;
        this.makanan = m;
        this.habitat = h;
    }

    public abstract void bergerak(); //abstract method
    public abstract void bernapas();
    public void cetakInfo(){
        System.out.println("Berat   : " + berat);
        System.out.println("Makanan : " + makanan);
        System.out.println("Habitat : " + habitat);
    }
}
