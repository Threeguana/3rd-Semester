
public class Refrigerator extends ElectronicDevice {
    private int doorCount;

    public Refrigerator(int doorCount, double price, String color, String brand) {
        super(price, color, brand);
        this.doorCount = doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Door Count: " + getDoorCount());
    }
}
