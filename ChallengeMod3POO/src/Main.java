import br.com.leodev.model.bank_account.BankAccount;
import br.com.leodev.model.bank_account.CurrentAccount;
import br.com.leodev.model.car.CarModel;
import br.com.leodev.model.primeNumbers.VerifyPrime;

public class Main {
    public static void main(String[] args) {
        CarModel car = new CarModel();

        car.setModel("Argo");
        car.setYearPrice1(80000);
        car.setYearPrice2(90000);
        car.setYearPrice3(50000);

        car.calculatePrice();

        CurrentAccount ba = new CurrentAccount();
        ba.deposit();
        ba.withdraw();
        ba.showBalance();
        ba.chargeFee();

        VerifyPrime verify = new VerifyPrime();

    }
}
