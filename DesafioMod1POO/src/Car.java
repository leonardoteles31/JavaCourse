public class Car {
    String model;
    String year;
    String color;

    void showDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    void carAge(int currentYear) {
        int age = currentYear - Integer.parseInt(year);
        System.out.println("Car Age: " + age + " years");
    }
}
