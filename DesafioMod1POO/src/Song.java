public class Song {
    String title;
    String artist;
    int realeaseYear;
    double rate;
    double totalRate;

    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Release Year: " + realeaseYear);
        System.out.println("Rate: " + rate);
    }

    void rateSong(double rate) {
        this.rate = rate;
        totalRate += rate;
    }

    double avgRate() {
        return this.rate / totalRate;
    }


}
