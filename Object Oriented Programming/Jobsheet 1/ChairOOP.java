public class ChairOOP {
    public String type, color;
    public int price;

    public ChairOOP(String t, String c, int p) {
        type = t;
        color = c;
        price = p;
    }

    public void info() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public int increasePrice(int increment) {
        price += increment;
        return price;
    }

    public int decreasePrice(int decrement) {
        price -= decrement;
        return price;
    }

    public static void main(String[] args) {
        ChairOOP chair1 = new ChairOOP("Dining Chair", "Black", 150000);
        chair1.increasePrice(10000);
        chair1.info();

        System.out.println();

        ChairOOP chair2 = new ChairOOP("Folding Chair", "Red", 100000);
        chair2.decreasePrice(30000);
        chair2.info();
    }
}
