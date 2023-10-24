package org.example;

import org.example.model.Book;
import org.example.model.Newspaper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodTests {

    @Test void testBook(){
        // ok
        Book book = new Book("Harry Potter");
        book.setTitle("The Hunger Games");
        assertEquals("The Hunger Games", book.getTitle());
    }

    @Test void testNewspaper(){
        Newspaper newspaper = new Newspaper("New York Time");
        newspaper.setCurrentPage(2);
        assertEquals(2, newspaper.getCurrentPage());
    }
}
