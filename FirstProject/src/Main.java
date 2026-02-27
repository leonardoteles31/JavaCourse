import java.util.Scanner;

public class Main {
    void main(String[] args) {
        String name = "John Doe";
        String accountType = "Current";
        double balance = 1000.00;
        int option = 0;

        Scanner kb = new Scanner(System.in);

        System.out.println("""
        *******************************
        Initial clients data:

        Name: """ + name + "\n" + """
        Account type: """ + accountType  + "\n" + """ 
        Balance: """ + balance + "\n" + """   
        ******************************* """);

        String menu = """
        1 - Balance Consultation
        2 - Deposit
        3 - Withdrawal
        4 - Exit
        
        Enter the option desired:  """;

        while (option != 4) {
            System.out.print(menu);
            option = kb.nextInt();

            if (option == 1) {
                System.out.println("Your balance is: " + balance);
            } else if (option == 2) {
                System.out.print("Enter the amount to deposit: ");
                double amount = kb.nextDouble();
                System.out.println("Deposit successful! New balance: " + (balance + amount));
            } else if (option == 3) {
                System.out.print("Enter the amount to withdraw: ");
                double amount = kb.nextDouble();
                if (amount > 1000.00) {
                    System.out.println("Insufficient funds! Withdrawal failed.");
                } else {
                    System.out.println("Withdrawal successful! New balance: " + (balance - amount));
                }
            } else if (option == 4) {
                System.out.println("Exiting... Thank you for using our services!");
            } else {
                System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
