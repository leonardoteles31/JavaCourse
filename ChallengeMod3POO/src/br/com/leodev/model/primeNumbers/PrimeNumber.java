package br.com.leodev.model.primeNumbers;

public class PrimeNumber {

    public boolean verifyPrimacy(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void listPrimes(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (verifyPrimacy(i)) {
                System.out.println(i);
            }
        }
    }
}
