import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Stiven King", "Оно", "1986");
        Book book2 = new Book("Chuck Palahniuk", "Бойцовский клуб", "1996");
        //Не придумал как назвать поэтому 1 и 2
        // проверка
        System.out.println("Автор " + book2.getAuthor() + ". Название книги " + book2.getTitle() + ". Год выхода " + book2.getPublishingYear());
        System.out.println("Автор " + book1.getAuthor() + ". Название книги " + book1.getTitle() + ". Год выхода " + book1.getPublishingYear());
    }
}