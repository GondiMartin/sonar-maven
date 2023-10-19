package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        Page book = new Book("Harry Potter");
        Page newspaper = new Newspaper("New York Time");

        System.out.printf("Könyv aktuális címe: %s\n", ((Book) book).getTitle());
        System.out.println("Változtassuk meg a könyv címét 'The Hunger Games'-re.");
        ((Book) book).setTitle("The Hunger Games");

        System.out.printf("Újság aktuális oldala: %d\n", newspaper.getCurrentPage());
        System.out.println("Változtassuk meg az újság felnyitott oldalának sorszámát '2'-re.");
        newspaper.setCurrentPage(2);
    }
}