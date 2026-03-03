import br.com.leodev.model.*;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setAccNumber("123456789");
        System.out.println("Account Number: " + myAccount.getAccNumber());

        Product laptop = new Product(1500.00, "Laptop");
        laptop.applyDiscount(10);
        System.out.println("Product Name: " + laptop.getName());
        System.out.println("Product Price: $" + laptop.getPrice());

        PeopleAge person = new PeopleAge();
        person.setName("Alice");
        person.setAge(25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        person.isAdult();

        Student student = new Student("Bob", 85.0, 90.0, 78.0);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Average Grade: " + student.calculateAverage());

        Book book = new Book();
        book.setTitle("The Great Gatsby");
        book.setAuthor("F. Scott Fitzgerald");
        book.showDetails();

    }
}