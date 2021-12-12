package com.company.zad1;

/**
 * Utwórz klasę abstrakcyjną „Parent” z metodą „message”. Ma dwie podklasy, z których każda ma metodę
 * o tej samej nazwie „message”, która wyświetla odpowiednio „To jest pierwsza podklasa” i „To jest druga
 * podklasa”. Wywołaj metody „message”, tworząc obiekt dla każdej podklasy
 */
public class Main {
    public static void main(String[] args) {

        Parent p1 = new Podklasa1();
        Parent p2 = new Podklasa2();

        p1.message();
        p2.message();

    }
}
