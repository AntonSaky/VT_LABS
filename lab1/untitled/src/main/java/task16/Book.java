package task16;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void setEdition(int edition) {
        edition = edition;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return  "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Price: " + price + "\n" +
                "ISBN: " + isbn + "\n";
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Book book){
            return  book.author.equals(author) &&
                    book.title.equals(title) &&
                    book.price == price &&
                    book.isbn == isbn;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return  (31 * title.hashCode()
                + 17 * author.hashCode()
                + 13 * Integer.valueOf(price).hashCode()
                + 5 * Integer.valueOf(edition).hashCode()
                + 3 * Integer.valueOf(isbn).hashCode())
                % Integer.MAX_VALUE;
    }

    @Override
    public Book clone() {
        Book result = new Book(title, author, price, isbn);
        result.setEdition(edition);
        return result;
    }

    @Override
    public int compareTo(Book o){
        return this.isbn - o.isbn;
    }
}
