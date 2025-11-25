public class Borrow {
    private UniStudent2 UniStudent;
    private Book borrowedBook;

    public Borrow(UniStudent2 UniStudent) {
        this.UniStudent = UniStudent;
    }

    public void borrowedBook(Book b) {
        this.borrowedBook = b;
        System.out.println(UniStudent.getName() + " borrow book: " + b.getTitle());
    }

    public void returnBook(Book b) {
        if (borrowedBook != null && borrowedBook == b) {
            System.out.println(UniStudent.getName() + " return book: " + b.getTitle());
            borrowedBook = null;
        }
    }

    public void showBr() {
        if (borrowedBook != null) {
            System.out.println(
                    "Mahasiswa " + getName() + " mengembalikan buku " + borrowedBook.getTitle());
        } else {
            System.out.println("Tidak ada buku yang sedang dipinjam.");
        }
    }
}
