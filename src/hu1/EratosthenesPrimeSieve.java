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

    static boolean[] primes = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Geben Sie eine Obergrenze ein");
        EratosthenesPrimeSieve er = new EratosthenesPrimeSieve(Integer.parseInt(scanner.nextLine()));
        er.printPrimes();
        int length = primes.length;

    }

    public EratosthenesPrimeSieve(int pobergrenze) {
        primes = new boolean[pobergrenze];
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
}
