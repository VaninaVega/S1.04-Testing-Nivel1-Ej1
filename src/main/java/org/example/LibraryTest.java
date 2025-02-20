package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
        library.addBook(new Book("Cinderella"));
        library.addBook(new Book("The Beauty and the Beast"));
    }

    @Test
    public void testGetAllBooks() {
        assertEquals(2, library.getAllBookTitles().size());
        assertTrue(library.getAllBookTitles().contains("Cinderella"));
    }

    @Test
    public void testGetBookByPosition() {
        assertEquals("Cinderella", library.getBookByPosition(0).getTitle());
        assertThrows(IndexOutOfBoundsException.class, () -> library.getBookByPosition(10));
    }

    @Test
    public void testAddBookByPosition() {
        Book newBook = new Book("Pocahontas");
        assertTrue(library.addBookByPosition(1, newBook));
        assertEquals("Pocahontas", library.getBookByPosition(1).getTitle());
    }

    @Test
    public void testDeleteBook() {
        assertTrue(library.deleteBookByTitle("Cinderella"));
        assertFalse(library.deleteBookByTitle("Nonexistent Book"));
        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testNoDuplicates() {
        assertFalse(library.addBook(new Book("Cinderella")));
        assertEquals(2, library.getBooks().size());
    }
}



