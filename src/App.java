public class App {
    public static void main(String[] args) throws Exception {
        Book childrensBook1 = new Book("Oh The Places You'll Go", "Dr.Sueus", "978-02-300-1-201", 1990, 3);
        Book childrensBook2 = new Book("Goodnight Moon", "Margaret Wise", "978-53-478-5-327", 1970, 4);
        Library.addNewBook(childrensBook1);
        Library.addNewBook(childrensBook2);
        childrensBook2.updateAvailableCopies(4);
        //Library.displayAllBooks();
        Magazine vogueMagazine1 = new Magazine("Vogue Magazine", "Vogue", "979-05-287-251", 2025, 2, 501, "May");
        Library.addNewBook(vogueMagazine1);
        Library.displayAllBooks();
        System.out.println(childrensBook1.toString());
        System.out.println(vogueMagazine1.toString());
        Magazine vogueMagazine2 = new Magazine("Vogue Magazine", "Vogue", "979-05-287-252", 2025, 3,502, "June");
        Magazine timeMagazine1 = new Magazine("Time Magazine", "Time", "978-01-299-873", 2025, 1, 120, "April");
    }
}
