public class Borrow {
    private UniStudent2 uniStudent;
    private Book borrowedBook;

    public Borrow(UniStudent2 uniStudent) {
        this.uniStudent = uniStudent;
    }

    public void borrowBook(Book book) {
        this.borrowedBook = book;
        System.out.println(uniStudent.getName() + " borrowed the book: " + book.getTitle());
    }

    public void returnBook(Book book) {
        if (borrowedBook != null && borrowedBook == book) {
            System.out.println(uniStudent.getName() + " returned the book: " + book.getTitle());
            borrowedBook = null;
        } else {
            System.out.println("The student did not borrow this book.");
        }
    }

    public void showBorrowedBook() {
        if (borrowedBook != null) {
            System.out.println("Student " + uniStudent.getName() + " is currently borrowing: "
                    + borrowedBook.getTitle());
        } else {
            System.out.println("No book is currently being borrowed.");
        }
    }
}
