import java.util.*;
import java.util.stream.*;
class Book {
    String genre;
    int pages;
    Book(String g, int p) { genre = g; pages = p; }
    String getGenre() { return genre; }
    int getPages() { return pages; }
}
public class LibraryBookStatistics {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Fiction", 300),
            new Book("Fiction", 250),
            new Book("Science", 400),
            new Book("Science", 500),
            new Book("History", 350)
        );
        
        Map<String, IntSummaryStatistics> stats = books.stream()
            .collect(Collectors.groupingBy(Book::getGenre, Collectors.summarizingInt(Book::getPages)));
        
        System.out.println(stats);
    }
}