import inheritance.Lecturer;

public class InheritanceDemo {
    public static void main(String[] args) {

        // Example using parameterized constructor
        Lecturer lec1 = new Lecturer("34329837", "Yansy", 3_000_000, "1989432439");
        System.out.println(lec1.getAllInfo());
    }
}
