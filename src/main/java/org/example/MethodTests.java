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
        System.out.println(book.getTitle());
    }

    @Test
    void TestNewspaperMethod(){
        Newspaper newspaper = new Newspaper("New York Time");
        newspaper.setCurrentPage(2);
        System.out.println(newspaper.getCurrentPage());
    }
}
