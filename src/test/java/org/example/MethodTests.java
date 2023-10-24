package org.example;

import org.example.model.Page;
import org.example.model.Book;
import org.example.model.Newspaper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodTests {
    Page book;
    Page newspaper;
    @BeforeEach
    void init(){
        book = new Book("Harry Potter");
        newspaper = new Newspaper("New York Time");
    }

    @Test void testBookTitle(){
        book.setTitle("The Hunger Games");
        assertEquals("The Hunger Games", book.getTitle());
    }

    @Test void testNewspaperPageCounter(){
        newspaper.setCurrentPage(2);
        assertEquals(2, newspaper.getCurrentPage());
    }

    @Test void testBookHasSameTitle_success_notSame(){
        Page other_book = new Book("The Hunger Games");
        boolean result = other_book.hasSameTitle(book.getTitle());
        assertEquals(false, result);
    }

    @Test void testBookHasSameTitle_success_same(){
        Page other_book = new Book("Harry Potter");
        boolean result = other_book.hasSameTitle(book.getTitle());
        assertEquals(true, result);
    }
}
