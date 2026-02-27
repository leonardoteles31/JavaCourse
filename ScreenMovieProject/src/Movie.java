public class Movie {
    String title;
    int releaseYear;
    boolean includedInPlan;
    double rating;
    int totalRatings;
    int durationInMinutes;

    void showDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Release Year: " + this.releaseYear);
        System.out.println("Included in Plan: " + this.includedInPlan);
        System.out.println("Rating: " + this.rating);
        System.out.println("Total Ratings: " + this.totalRatings);
        System.out.println("Duration (minutes): " + this.durationInMinutes);
    }

    void rates(double rate) {
        rating += rate;
        totalRatings++;
    }

    double rateAverage() {
        return rating / totalRatings;
    }
}
