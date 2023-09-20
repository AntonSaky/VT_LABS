package task16;

import java.util.Comparator;

public class BookAuthorComporator implements Comparator<Book> {
    public int compare(Book a, Book b) {
        return a.getAuthor().toLowerCase().compareTo(b.getAuthor().toLowerCase());
    }
}
