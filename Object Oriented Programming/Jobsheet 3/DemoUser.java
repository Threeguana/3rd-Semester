public class DemoUser {
    public static void main(String[] args) {

        User user1 = new User("andini.tribuana", "Andini Tribuana", "threebuanandini@gmail.com");

        // Optional fields
        user1.setAddress("Malang, Jawa Timur");
        user1.setJob("Software Developer");

        user1.printInfo();
    }
}
