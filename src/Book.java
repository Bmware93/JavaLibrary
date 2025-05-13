public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int publishYear;
    private int availableCopies;

    public Book(String title, String author, String isbn, int publishYear, int availableCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
        this.publishYear = publishYear;
        this.availableCopies = availableCopies;
    }
    public @Override String toString() {
        return String.format("%s by %s", title, author);
    }
    //Instance method. Only available when called on a reference to a specific object
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Publish Year: " + publishYear);
        System.out.println("Number of Copies: " + availableCopies);
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }
    public void updateAvailableCopies(int count) {
        availableCopies = count;
    }
    public boolean isAvailable() {
        return availableCopies > 0;
    }
   
}


