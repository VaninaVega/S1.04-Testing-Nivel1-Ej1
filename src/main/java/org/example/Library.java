package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public boolean addBook(Book book) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle())) {
                return false;  // El libro ya existe, no se añade.
            }
        }
        books.add(book);
        return true;  // Se añade porque no hay duplicados.
    }


    public List<String> getAllBookTitles() {
        List<String> titles = new ArrayList<>();
        for (Book book : books) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    public Book getBookByPosition(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position);
        }
        throw new IndexOutOfBoundsException("Position out of range.");
    }

    public boolean addBookByPosition(int position, Book book) {
        if (position >= 0 && position <= books.size() && !books.contains(book)) {
            books.add(position, book);
            return true;
        }
        return false;
    }

    public boolean deleteBookByTitle(String title) {
        return books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }
}
