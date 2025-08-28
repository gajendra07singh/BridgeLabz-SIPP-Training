import java.util.*;
import java.util.stream.Collectors;

class Book {
    String title;
    String author;
    int year;
    double rating;

    Book(String title, String author, int year, double rating) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = rating;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Rating: " + rating);
        System.out.println("--------------------");
    }
}

class Library {
    List<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    List<Book> filterBooks() {
        return books.stream()
                .filter(book -> book.year > 2015)
                .filter(book -> book.rating > 4.5)
                .collect(Collectors.toList());
    }

    void displayFilteredBooks() {
        List<Book> filtered = filterBooks();
        if (filtered.isEmpty()) {
            System.out.println("No books match the criteria.");
        } else {
            for (Book b : filtered) {
                b.display();
            }
        }
    }
}
