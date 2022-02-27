
public class Book {

    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public void add() {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.title;
    }

    public String toString() {
        return this.title + ", " + pages + " pages, " + this.publicationYear;
    }
}
