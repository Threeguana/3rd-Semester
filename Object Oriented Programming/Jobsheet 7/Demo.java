public class Demo {
    public static void main(String[] args) {

        Herbal h1 = new Herbal();
        h1.setName("Ginger");
        h1.setColor("Pink");
        h1.setSize(20);
        h1.setBenefit("Reduces inflammation");

        h1.displayInfo();
        h1.water();
        h1.convertToMedicine();
    }
}
