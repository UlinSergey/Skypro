import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("Chuck", "Palahniuk");

        Book book1 = new Book("Оно", author1, 1986);
        Book book2 = new Book("Бойцовский клуб", author2, 1996);

        System.out.println(book1.getTitle() + " был опубликован в " + book1.getPublicationYear());
        System.out.println(book2.getTitle() + " был опубликован в " + book2.getPublicationYear());

        book1.setPublicationYear(2013);
        System.out.println(book1.getTitle() + " был опубликован в " + book1.getPublicationYear());

        System.out.println(book1);
        System.out.println(book2);
    }
}