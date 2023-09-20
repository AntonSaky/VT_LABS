package task16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ComparatorsTest {
    private Book[] books;

    @BeforeEach
    public void setUp(){
        books = new Book[]{
                new Book("Cqewr","Oleg",20,30),
                new Book("Aasd","Egor",30,10),
                new Book("Bewr","Sasha",40,50),
                new Book("Qwerty","Anton",15,5),
                new Book("Qwerty","Oleg",50,4),
                new Book("Qwerty","Anton",55,6),
                new Book("Qwerty","Oleg",413,3),
                new Book("Qwerty","Sasha",18,89),
                new Book("Qwerty","Egor",2,98),
        };
    }

    @Test
    public void sortByTitleTest(){
        Book[] expected = new Book[]{
                new Book("Aasd","Egor",30,10),
                new Book("Bewr","Sasha",40,50),
                new Book("Cqewr","Oleg",20,30),
                new Book("Qwerty","Anton",15,5),
                new Book("Qwerty","Oleg",50,4),
                new Book("Qwerty","Anton",55,6),
                new Book("Qwerty","Oleg",413,3),
                new Book("Qwerty","Sasha",18,89),
                new Book("Qwerty","Egor",2,98),
        };
        Arrays.sort(books, new BookTitleComporator());
        assertArrayEquals(expected, books);
    }

    @Test
    public void sortByTitleByAuthorTest(){
        Book[] expected = new Book[]{
                new Book("Aasd","Egor",30,10),
                new Book("Bewr","Sasha",40,50),
                new Book("Cqewr","Oleg",20,30),
                new Book("Qwerty","Anton",15,5),
                new Book("Qwerty","Anton",55,6),
                new Book("Qwerty","Egor",2,98),
                new Book("Qwerty","Oleg",50,4),
                new Book("Qwerty","Oleg",413,3),
                new Book("Qwerty","Sasha",18,89),
        };
        Arrays.sort(books, new BookTitleComporator().
                thenComparing(new BookAuthorComporator()));
        assertArrayEquals(expected, books);
    }

    @Test
    public void sortByAuthorByTitleTest(){
        Book[] expected = new Book[]{
                new Book("Qwerty","Anton",15,5),
                new Book("Qwerty","Anton",55,6),
                new Book("Aasd","Egor",30,10),
                new Book("Qwerty","Egor",2,98),
                new Book("Cqewr","Oleg",20,30),
                new Book("Qwerty","Oleg",50,4),
                new Book("Qwerty","Oleg",413,3),
                new Book("Bewr","Sasha",40,50),
                new Book("Qwerty","Sasha",18,89),
        };
        Arrays.sort(books, new BookAuthorComporator().
                thenComparing(new BookTitleComporator()));
        assertArrayEquals(expected, books);
    }

    @Test
    public void sortByAuthorByTitleByPriceTest(){
        Book[] expected = new Book[]{
                new Book("Qwerty","Anton",15,5),
                new Book("Qwerty","Anton",55,6),
                new Book("Aasd","Egor",30,10),
                new Book("Qwerty","Egor",2,98),
                new Book("Cqewr","Oleg",20,30),
                new Book("Qwerty","Oleg",50,4),
                new Book("Qwerty","Oleg",413,3),
                new Book("Bewr","Sasha",40,50),
                new Book("Qwerty","Sasha",18,89),
        };
        Arrays.sort(books, new BookAuthorComporator().
                thenComparing(new BookTitleComporator()).
                thenComparing(new BookPriceComparator()));
        assertArrayEquals(expected, books);
    }

}
