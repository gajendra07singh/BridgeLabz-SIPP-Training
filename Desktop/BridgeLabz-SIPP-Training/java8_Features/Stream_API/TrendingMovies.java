package Stream_API;

import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    double rating;
    int releaseYear;

    public Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return title + " (⭐ " + rating + ", 📅 " + releaseYear + ")";
    }
}

public class TrendingMovies {
    public static void main(String[] args) {
        // Sample movie list
        List<Movie> movies = Arrays.asList(
            new Movie("Inception", 8.8, 2010),
            new Movie("Avengers: Endgame", 8.4, 2019),
            new Movie("The Dark Knight", 9.0, 2008),
            new Movie("Interstellar", 8.6, 2014),
            new Movie("Spider-Man: No Way Home", 8.3, 2021),
            new Movie("Oppenheimer", 8.9, 2023),
            new Movie("Dune 2", 8.7, 2024),
            new Movie("Shutter Island", 8.2, 2010)
        );

        System.out.println("=== Top 5 Trending Movies ===");

        movies.stream()
            .filter(m -> m.rating >= 8.3) 
            .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                              .thenComparing(m -> m.releaseYear)
                              .reversed()) 
            .limit(5) 
            .forEach(System.out::println);
    }
}

