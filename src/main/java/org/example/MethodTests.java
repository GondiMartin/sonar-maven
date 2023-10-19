package org.example;
import org.example.model.Book;
import org.example.model.Newspaper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MethodTests {

    @Test
    void TestBookMethod(){
        Book book = new Book("Harry Potter");
        book.setTitle("The Hunger Games");
        Assertions.assertEquals(book.getTitle(), "The Hunger Games");
    }

    @Test
    void TestNewspaperMethod(){
        Newspaper newspaper = new Newspaper("New York Time");
        newspaper.setCurrentPage(2);
        Assertions.assertEquals(newspaper.getCurrentPage(), 2);
    }
}
