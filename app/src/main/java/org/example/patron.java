package org.example;

class Patron {
    private String name;
    private int patronId;
    private List<String> borrowedBooks;

    public Patron(String name, int patronId) {
        this.name = name;
        this.patronId = patronId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter for Patron ID
    public int getPatronId() {
        return patronId;
    }

    // Borrow a book
    public void borrowBook(String book) {
        borrowedBooks.add(book);
    }

    // Return a book
    public void returnBook(String book) {
        borrowedBooks.remove(book);
    }

    // List Borrowed Books
    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }
}

