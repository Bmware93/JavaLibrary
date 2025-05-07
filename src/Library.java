import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

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
            book.printBookDetails();
            System.out.println("-------------------------");
        }
    }
}
