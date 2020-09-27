/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu1;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    static Scanner scanner = new Scanner(System.in, "Windows-1252");

    int[] evenNr;
    int[] primeNr;

    boolean[] primes = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Eratosthenes Primzahlen finder Algorithmus");
        System.out.println("Geben Sie eine Obergrenze ein");
        EratosthenesPrimeSieve er = new EratosthenesPrimeSieve(Integer.parseInt(scanner.nextLine()));
        er.printPrimes();

    }

    public EratosthenesPrimeSieve(int obergrenze) {
        primes = new boolean[obergrenze];
    }

    @Override
    public boolean isPrime(int p) {
        int factors = 0;
        int j = 1;

        while (j <= p) {
            if (p % j == 0) {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int i = 0; i < primes.length; i++) {
            if (!isPrime(i)) {
                primes[i] = false;
            }
        }

        for (int y = 2; y < primes.length; y++) {
            if (primes[y]) {
                System.out.print(y + " ");
            }
        }
    }

    public void getPrimes() {
        int count = 0;

        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                count++;
            }
        }

        primeNr = new int[count];

        int counter = 0;
        for (int i = 0; i < count; i++) {
            if (primes[i]) {
                primeNr[counter] = i;
                counter++;
            }
        }
    }

    public boolean isEven(int p) {
        if (p <= 2) {
            return false;
        } else if (p % 2 == 0) {
            return true;
        }
        return false;
    }

    public void even() {
        int[] tmpNr = new int[primes.length];

        for (int i = 0; i < tmpNr.length; i++) {
            tmpNr[i] = i;
        }
        int counter = 0;
        for (int i = 0; i < tmpNr.length; i++) {
            if (!isEven(i)) {
                tmpNr[i] = -1;
                counter++;
            }
        }
        evenNr = new int[primes.length - counter];
        int count = 0;
        for (int y = 2; y < tmpNr.length; y++) {
            if (tmpNr[y] != -1) {
                evenNr[count] = tmpNr[y];
                count++;
            }
        }
    }

}
