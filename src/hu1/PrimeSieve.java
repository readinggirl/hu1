/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu1;

/**
 *
 * @author Teresa
 */
public interface PrimeSieve {

    //Ueberprueft ob p eine primzahl ist
    public boolean isPrime(int p);

    //Gibt alle primzahlen bis zur obergrenze auf der konsole aus
    public void printPrimes();
}
