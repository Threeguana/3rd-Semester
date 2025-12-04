public class SmartFridge extends AlatElektronik implements IAudible{
    private int volume;

    public SmartFridge(int volume, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment){
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement){
        volume -= decrement;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Volume : " + getVolume());
    }
}
