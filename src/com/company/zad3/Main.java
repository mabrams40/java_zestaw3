package com.company.zad3;

/**
 * Utwórz klasę abstrakcyjną „Animals” za pomocą dwóch metod abstrakcyjnych „cats” i „dogs”. Teraz
 * utwórz klasę „Cats” z metodą „cats”, która drukuje „Cats meow” i klasę „Dogs” z metodą „dogs”, która
 * drukuje „Dogs bark”, obie dziedziczą klasę „Animals”. Teraz utwórz obiekt dla każdej z podklas i wywołaj
 * odpowiednie metody.
 */
public class Main {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        Cats cat = new Cats();

        dog.dogs();
        cat.cats();
    }
}
