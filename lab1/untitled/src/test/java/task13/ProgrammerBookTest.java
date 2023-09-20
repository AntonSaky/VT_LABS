package task13;

import org.junit.jupiter.api.Test;
import task12.Book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProgrammerBookTest {
    @Test
    public void programmerBookTest(){
        ProgrammerBook book1 = new ProgrammerBook("Title1","Author1",10,0,"eng",1);
        ProgrammerBook book2 = new ProgrammerBook("Title2","Author2",20,1,"rus", 2);
        ProgrammerBook book3 = new ProgrammerBook("Title1","Author1",10,0,"eng",1);
        String str1 = """
                Title: Title1
                Author: Author1
                Price: 10
                ISBN: 0
                Lang: eng
                Level: 1
                """;
        String str2 = """
                Title: Title2
                Author: Author2
                Price: 20
                ISBN: 1
                Lang: rus
                Level: 2
                """;
        assertEquals(str1,book1.toString());
        assertEquals(str2, book2.toString());
        assertNotEquals(book1, book2);
        assertEquals(book1, book3);
        assertNotEquals(2, book1);
    }

}
