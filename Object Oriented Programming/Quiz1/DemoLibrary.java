public class DemoLibrary {
    public static void main(String[] args) {
        UniStudent2 mhs1 = new UniStudent2("244107060140", "Andini Tribuana");
        Book book1 = new Book("Matematika", "Andi", "2020");
        Book book2 = new Book("BIO", "Andi", "2022");
        Book book3 = new Book("Kimia", "Andi", "2010");

        Borrow br1 = new Borrow(mhs1);
        br1.borrowBook(book1);
        br1.borrowBook(book3);
        br1.borrowBook(book2);

        br1.returnBook(book1);
        br1.showBorrowedBook();
    }
}
