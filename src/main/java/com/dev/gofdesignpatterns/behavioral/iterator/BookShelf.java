package com.dev.gofdesignpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements BookCollection {

    private final List<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookShelfIterator(books);
    }

}

