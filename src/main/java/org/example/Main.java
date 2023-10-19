package org.example;

import org.example.model.Book;
import org.example.model.Newspaper;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter");
        book.setTitle("The Hunger Games");
        System.out.println(book.getTitle());
        Newspaper newspaper = new Newspaper("New York Time");
        newspaper.setCurrentPage(2);
        System.out.println(newspaper.getCurrentPage());
    }
}
