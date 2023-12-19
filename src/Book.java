public class Book {
    private final String author;
    private String title;
    private String publishingYear;

    public Book(String author, String title, String publishingYear) {
        this.author = author;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


    public String getPublishingYear() {
        return publishingYear;
    }
}