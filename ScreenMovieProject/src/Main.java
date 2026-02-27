public class Main {
    static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.title = "Cars";
        myMovie.releaseYear = 2006;
        myMovie.durationInMinutes = 116;
        myMovie.rating = 8.1;
        myMovie.totalRatings = 1000000;
        myMovie.includedInPlan = true;

        myMovie.showDetails();
        myMovie.rates(9.0);
        myMovie.rates(7.5);
        myMovie.rates(8.0);
        System.out.println("New Rating: " + myMovie.rating);
        System.out.println("Total Ratings: " + myMovie.totalRatings);
    }
}
