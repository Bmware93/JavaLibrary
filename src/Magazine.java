
public class Magazine extends Book {
    private int issueNumber;
    private String releaseMonth;

    public Magazine(String title, String author, String isbn, int publishYear, int availableCopies, int issueNumber, String releaseMonth) {
        super(title, author, isbn, publishYear, availableCopies);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }
    public @Override String toString() {
        return String.format("%s %s %s Edition", this.getTitle(), releaseMonth, this.getPublishYear());
    }
    public int getIssueNumber() {
        return issueNumber;
    }
    public String getRelseaseMonth() {
        return releaseMonth;
    }

}
