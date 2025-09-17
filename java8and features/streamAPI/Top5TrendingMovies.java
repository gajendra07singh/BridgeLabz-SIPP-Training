import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;
    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    public String toString() {
        return name + " (" + year + ") - Rating: " + rating;
    }
}
public class Top5TrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.9, 2023),
            new Movie("Movie B", 9.1, 2024),
            new Movie("Movie C", 7.8, 2022),
            new Movie("Movie D", 9.3, 2024),
            new Movie("Movie E", 8.5, 2023),
            new Movie("Movie F", 9.0, 2024)
        );
        movies.stream()
              .sorted(Comparator.comparingDouble((Movie m) -> m.rating).reversed()
              .thenComparing(m -> m.year, Comparator.reverseOrder()))
              .limit(5)
              .forEach(System.out::println);
    }
}