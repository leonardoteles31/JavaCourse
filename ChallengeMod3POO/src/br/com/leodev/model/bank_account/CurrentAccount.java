package br.com.leodev.model.bank_account;

public class CurrentAccount extends BankAccount{
    double fee;
    int month;

    public void chargeFee() {
        fee = 0.1;
        for (int i = 1; i <= 12; i++) {
            double retire = getBalance() * fee;
            setBalance(getBalance() - retire);
            System.out.printf("Your fee in value of: $%.2f was retire from your account%n", retire);
            i++;
        }
    }
}
