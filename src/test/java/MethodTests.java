import org.example.model.Book;
import org.example.model.Newspaper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodTests {

    @Test
    void TestBookMethod(){
        Book book = new Book("Harry Potter");
        book.setTitle("The Hunger Games");
        assertEquals(book.getTitle(), "The Hunger Games");
    }

    @Test
    void TestNewspaperMethod(){
        Newspaper newspaper = new Newspaper("New York Time");
        newspaper.setCurrentPage(2);
        assertEquals(newspaper.getCurrentPage(), 2);
    }
}
