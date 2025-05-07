public class App {
    public static void main(String[] args) throws Exception {
        Book childrensBook1 = new Book("Oh The Places You'll Go", "Dr.Sueus", "978-02-300-1-201", 1990, 25);
        Book childrensBook2 = new Book("Goodnight Moon", "Margaret Wise", "978-53-478-5-327", 1970, 30);
        Library.addNewBook(childrensBook1);
        Library.addNewBook(childrensBook2);
        childrensBook2.updateAvailableCopies(4);
        Library.displayAllBooks();



    }
}
