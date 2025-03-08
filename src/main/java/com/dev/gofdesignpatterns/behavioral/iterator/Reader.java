package com.dev.gofdesignpatterns.behavioral.iterator;

public class Reader {
    public static void main(String[] args) {
        // Создаем книжную полку и добавляем книги
        BookShelf shelf = new BookShelf();
        shelf.addBook(new Book("1984"));
        shelf.addBook(new Book("Brave New World"));
        shelf.addBook(new Book("Fahrenheit 451"));

        // Получаем итератор и обходим книги
        Iterator<Book> iterator = shelf.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Книга: " + book.title());
        }
    }
}
