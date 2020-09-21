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

    int obergrenze;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        System.out.println("Geben Sie eine Obergrenze ein");
        EratosthenesPrimeSieve er = new EratosthenesPrimeSieve(Integer.parseInt(scanner.nextLine()));
    }

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int p) {

    }

    @Override
    public void printPrimes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
