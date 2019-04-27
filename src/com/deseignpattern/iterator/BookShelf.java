package com.deseignpattern.iterator;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mnitta
 */

public class BookShelf implements Aggregate {
    private List<Book> books;
    private int last = 0;
    public BookShelf(final int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }
    public Book getBookAt(final int index) {
        return books.get(index);
    }
    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }
    public int getLength() {
        return last;
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
