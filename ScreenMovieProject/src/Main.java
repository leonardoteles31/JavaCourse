import br.com.leodev.screenmovie.calculations.TimeCalculator;
import br.com.leodev.screenmovie.model.Movie;
import br.com.leodev.screenmovie.model.Serie;

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

        Movie anotherMovie = new Movie();
        anotherMovie.setTitle("The Incredibles");
        anotherMovie.setReleaseYear(2004);
        anotherMovie.setDurationInMinutes(115);
        anotherMovie.showDetails();

        Serie GossipGirl = new Serie();
        GossipGirl.setTitle("Gossip girl");
        GossipGirl.setReleaseYear(2007);
        GossipGirl.showDetails();
        GossipGirl.setSeasons(6);
        GossipGirl.setEpisodesPerSeason(20);
        GossipGirl.setMinutesPerEpisode(45);
        System.out.println("Duration of the serie in minutes: " + GossipGirl.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        System.out.println("Total time to watch: " + calculator.getTotalTime() + " minutes");

        calculator.include(GossipGirl);
        System.out.println("Total time to watch: " + calculator.getTotalTime() + " minutes");

    }
}
