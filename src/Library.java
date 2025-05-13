import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books = new ArrayList<>();

    public static void addNewBook(Book book) {
        books.add(book);
    }
    public static void removeBookBy(String ISBN) {
        for (Book book : books) {
            if(book.getISBN().equals(ISBN)) {
                books.remove(book);
            }
        }
    }
    public static void displayAllBooks() {
        for (Book book : books) {
            book.printDetails();
            System.out.println("-------------------------");
        }
    }
    public void checkoutBook(Book book) {
        if(book.isAvailable()) {
            int bookCount = book.getAvailableCopies();
           bookCount -= 1;
           book.updateAvailableCopies(bookCount);
        }
   }
}
