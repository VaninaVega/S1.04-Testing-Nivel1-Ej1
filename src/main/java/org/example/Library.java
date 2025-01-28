package org.example;

import java.util.ArrayList;

public class Library {

    private ArrayList<String> books;

    public ArrayList<String> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<String> books) {
        this.books = books;
    }

    public Library() {
        this.books = new ArrayList<>();

    }

    public void addBook(String title2) {
        boolean exists = false;
        for (String book : books) {
            if (book.equalsIgnoreCase(title2)) {
                exists = true;
            }
        }
        if (exists == false) {
            books.add(title2);
            System.out.println("Book added: " + title2);
        } else {
            System.out.println("Book already exist");
        }
    }

    public String getAllBooks() {
        String response = "";
        //for (String book:books) {
        for (int i = 0; i < books.size(); i++) {
            if (i == 0) {
                response = response + books.get(i);
            } else {
                response = response + ", " + books.get(i);
            }
        }
            return response;
        }

        public String getBookByPosition (int position){
            if (position >= 0 && position < books.size()) {
                return books.get(position);
            } else {
                return "Not valid position";
            }
        }

        public void addBookByPosition ( int position, String title){
            if (position >= 0 && position < books.size()) {
                books.add(position, title);
                System.out.println("The book " + title + " has been added to library in position: " + position + ".");
            } else {
                System.out.println("Invalid position. Book can not be added");
            }
        }

        public void deleteBookByTitle (String title){
            books.remove(title);
            System.out.println("Book title " + title + ", has been removed.");
        }
    }
