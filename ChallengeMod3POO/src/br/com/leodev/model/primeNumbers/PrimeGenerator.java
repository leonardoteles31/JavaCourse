package br.com.leodev.model.primeNumbers;

public class PrimeGenerator extends PrimeNumber{

    public int generateNextPrime(int num) {

        int next = num + 1;

        while (!verifyPrimacy(next)) {
            next++;
        }
        return next;
    }
}
