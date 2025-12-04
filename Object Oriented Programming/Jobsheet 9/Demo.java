public class Demo {
    public static void main(String[] args) {

        Fan fan1 = new Fan("Wind", 250000, "White", "Miyako");
        fan1.setType("Wall");
        fan1.getInfo();

        System.out.println();

        Refrigerator fridge1 = new Refrigerator(2, 3500000, "Silver", "Polytron");
        fridge1.setPrice(3000000);
        fridge1.setDoorCount(2);
        fridge1.getInfo();

        System.out.println();

        TV tv1 = new TV("LED", 15, 5000000, "Black", "Samsung");
        tv1.setScreenType("OLED");
        tv1.increaseVolume(10);
        tv1.getInfo();

        System.out.println();

        SmartFridge smartFridge1 = new SmartFridge(10, 8000000, "Gray", "LG");
        smartFridge1.decreaseVolume(5);
        smartFridge1.getInfo();
    }
}
