public class TV extends ElectronicDevice implements IAudible {

    private String screenType;
    private int volume;

    public TV(String screenType, int volume, double price, String color, String brand) {
        super(price, color, brand);
        this.screenType = screenType;
        this.volume = volume;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
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
        System.out.println("Screen Type : " + getScreenType());
        System.out.println("Volume      : " + getVolume());
    }
}
