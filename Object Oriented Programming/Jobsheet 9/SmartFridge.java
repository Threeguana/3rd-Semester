public class SmartFridge extends ElectronicDevice implements IAudible {
    private int volume;

    public SmartFridge(int volume, double price, String color, String brand) {
        super(price, color, brand);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void increaseVolume(int increment) {
        volume += increment;
    }

    @Override
    public void decreaseVolume(int decrement) {
        volume -= decrement;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Volume: " + getVolume());
    }
}
