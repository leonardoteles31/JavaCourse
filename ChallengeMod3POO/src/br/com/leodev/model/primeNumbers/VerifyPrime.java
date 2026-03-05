package br.com.leodev.model.primeNumbers;

public class VerifyPrime extends PrimeNumber {
    public void verifyPrime(int num) {
        if (verifyPrimacy(num)) {
            System.out.println("Is prime!");
        } else {
            System.out.println("Is not prime!");
        }
    }
}
