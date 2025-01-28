package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        library.addBook("Cinderella");
        library.addBook("The beauty and the beast");
        assertNotNull(library.getBooks().size(),
                "The list of books must not be null after create a new object.");
        assertEquals(2, library.getBooks().size(),
                "Confirm that the list has an expected size after inserting several books.");
        assertTrue(library.getBooks().contains("Cinderella"));
        assertFalse(library.getBooks().contains("Pocahontas"));
        assertFalse(library.getBooks().isEmpty());

    }

    @Test
    public void testGetAllBooks() {
        library.addBook("Cinderella");
        library.addBook("Pocahontas");
        assertEquals("Cinderella, Pocahontas", library.getAllBooks());
    }

    @Test
    public void testGetBookByPosition() {
        library.addBook("Cinderella");
        library.addBook("The beauty and the beast");

        assertEquals("Cinderella", library.getBookByPosition(0), "Book in position 0 should be 'Cinderella");
        assertEquals("Not valid position", library.getBookByPosition(10));

    }

    @Test
    public void testAddBookByPosition() {

        library.addBook("Cinderella");
        library.addBook("The beauty and the beast");

        library.addBookByPosition(1, "Pocahontas");
        assertEquals("Pocahontas", library.getBookByPosition(1));
    }

    @Test
    public void testNoDuplicates() {
        library.addBook("Cinderella");
        library.addBook("The beauty and the beast");
        library.addBook("Cinderella"); //Duplicated
        library.addBook("Pocahontas");
        assertEquals(3, library.getBooks().size());

    }

    @Test
    public void testAddBookModifyList() {
        assertEquals(0, library.getBooks().size());
        library.addBook("Cinderella");
        assertEquals(1, library.getBooks().size());
        library.addBook("The beauty and the beast");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testAddBookInCorrectPosition() {
        library.addBook("Cinderella");
        library.addBook("The beauty and the beast");
        library.addBookByPosition(0, "Pocahontas");
        assertEquals("Pocahontas", library.getBooks().get(0));
    }

    @Test
    public void testDeleteBook() {
        library.addBook("The beauty and the beast");
        library.addBook("Cinderella");
        assertEquals(2, library.getBooks().size());
        library.deleteBookByTitle("Cinderella");
        assertEquals(1, library.getBooks().size());
    }
}



