import br.com.leodev.screenmovie.model.Movie;

public class Main {
    static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("Cars");
        myMovie.setReleaseYear(2006);
        myMovie.setDurationInMinutes(116);

        myMovie.showDetails();
        myMovie.rates(9.0);
        myMovie.rates(7.5);
        myMovie.rates(8.0);
        System.out.println("Total Ratings: " + myMovie.getTotalRatings());
        System.out.println("Average Rating: " + myMovie.rateAverage());

    }
}
