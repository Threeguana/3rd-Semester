public class ElectronicDevice {

    private double price;
    private String color;
    private String brand;

    public ElectronicDevice(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    // ----- Getters & Setters -----

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // ----- Display Info -----

    public void getInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
    }
}
