public class Main {
    public static void main(String[] args) {
        People p = new People();
        p.showMsg();

        Calculator c = new Calculator();
        c.n1 = 10;
        c.doubleNum();

        Song s = new Song();
        s.title = "Shape of You";
        s.artist = "Ed Sheeran";
        s.realeaseYear = 2017;
        s.rateSong(7.5);
        s.rateSong(8.0);
        s.rateSong(9.0);
        s.showDetails();
        System.out.println("Average Rate: " + s.avgRate());

        Car car = new Car();
        car.model = "Toyota Camry";
        car.year = "2015";
        car.color = "Red";
        car.showDetails();
        car.carAge(2026);

        Student student = new Student();
        student.name = "Alice";
        student.age = 20;
        student.showDetails();
    }
}
