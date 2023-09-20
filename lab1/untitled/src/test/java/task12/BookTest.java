package task12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BookTest {
    @Test
    public void bookTest(){
        Book book1 = new Book("Title1","Author1",10,0);
        Book book2 = new Book("Title2","Author2",20,0);
        Book book3 = new Book("Title1","Author1",10,0);
        String str1 = """
                Title: Title1
                Author: Author1
                Price: 10
                ISBN: 0
                """;
        String str2 = """
                Title: Title2
                Author: Author2
                Price: 20
                ISBN: 0
                """;
        assertEquals(str1,book1.toString());
        assertEquals(str2, book2.toString());
        assertNotEquals(book1, book2);
        assertEquals(book1, book3);
        assertNotEquals(2, book1);
    }

}
