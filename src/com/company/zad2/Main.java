package com.company.zad2;

/**
 * Utwórz klasę abstrakcyjną „Bank” za pomocą metody abstrakcyjnej „getBalance”. 100 USD, 150 USD i
 * 200 USD są zdeponowane odpowiednio w bankach A, B i C. „BankA”, „BankB” i „BankC” to podklasy
 * klasy „Bank”, z których każda ma metodę o nazwie „getBalance”. Wywołaj tę metodę, tworząc obiekt
 * każdej z trzech klas.
 */
public class Main {
    public static void main(String[] args) {
        int balance;

        BankA bankA = new BankA();
        balance = bankA.getBalance();
        System.out.println("Bank A: " + balance + " USD.");

        BankB bankB = new BankB();
        balance = bankB.getBalance();
        System.out.println("Bank B: " + balance + " USD.");

        BankC bankC = new BankC();
        balance = bankC.getBalance();
        System.out.println("Bank C: " + balance + " USD.");

    }
}
