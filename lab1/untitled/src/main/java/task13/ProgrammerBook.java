package task13;

import task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn,String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Lang: " + language + "\n" +
                "Level: "+ level + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof ProgrammerBook book) {
            return super.equals(o) && book.language.equals(language) && book.level == level;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (31 * super.hashCode() + 31 * language.hashCode() + level * 17) % Integer.MAX_VALUE;
    }
}
