public class Chair {

    public static void main(String[] args) {
        String type, type2, type3, type4, type5, type6, type7, type8, type9, type10, color, color2, color3, color4, color5, color6, color7, color8, color9, color10;
        int price, price2, price3, price4, price5, price6, price7, price8, price9, price10;

        // first chair
        type = "Dining Chair";
        color = "Black";
        price = 100000;

        price = increasePrice(price, 20000);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);

        // second chair
        type2 = "Folding Chair";
        color2 = "Red";
        price2 = 100000;

        price2 = decreasePrice(price2, 20000);
        System.out.println("\nType: " + type2);
        System.out.println("Color: " + color2);
        System.out.println("Price: " + price2);

        // third chair
        type3 = "Bar Chair";
        color3 = "Red";
        price3 = 100000;

        price3 = increasePrice(price3, 200000);
        System.out.println("\nType: " + type3);
        System.out.println("Color: " + color3);
        System.out.println("Price: " + price3);

        // fourth chair
        type4 = "Folding Chair";
        color4 = "Red";
        price4 = 100000;

        price4 = decreasePrice(price4, 50000);
        System.out.println("\nType: " + type4);
        System.out.println("Color: " + color4);
        System.out.println("Price: " + price4);

        // fifth chair
        type5 = "\nStudy Chair";
        color5 = "Brown";
        price5 = 100000;

        price5 = increasePrice(price5, 20000);
        System.out.println("\nType: " + type5);
        System.out.println("Color: " + color5);
        System.out.println("Price: " + price5);

        // sixth chair
        type6 = "Sofa";
        color6 = "Purple";
        price6 = 10000000;

        price6 = decreasePrice(price6, 400000);
        System.out.println("\nType: " + type6);
        System.out.println("Color: " + color6);
        System.out.println("Price: " + price6);

        // seventh chair
        type7 = "Beanbag";
        color7 = "Blue";
        price7 = 3000000;

        price7 = decreasePrice(price7, 40000);
        System.out.println("\nType: " + type7);
        System.out.println("Color: " + color7);
        System.out.println("Price: " + price7);

        // eighth chair
        type8 = "Restaurant Chair";
        color8 = "White";
        price8 = 500000;

        price8 = increasePrice(price8, 20000);
        System.out.println("\nType: " + type8);
        System.out.println("Color: " + color8);
        System.out.println("Price: " + price8);

        // ninth chair
        type9 = "Office Chair";
        color9 = "White";
        price9 = 1000000;

        price9 = decreasePrice(price9, 2000);
        System.out.println("\nType: " + type9);
        System.out.println("Color: " + color9);
        System.out.println("Price: " + price9);

        // tenth chair
        type10 = "Lounge Chair";
        color10 = "Green";
        price10 = 40000;

        price10 = increasePrice(price10, 20000);
        System.out.println("\nType: " + type10);
        System.out.println("Color: " + color10);
        System.out.println("Price: " + price10);

    }

    public static int increasePrice(int price, int increment) {
        price += increment;
        return price;
    }

    public static int decreasePrice(int price, int decrement) {
        price -= decrement;
        return price;
    }
}
