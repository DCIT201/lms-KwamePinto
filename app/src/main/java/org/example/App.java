/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        // Create Library
        Library library = new Library();

        // Add Books
        library.addBook(new Book("book1", "Author1"));
        library.addBook(new Book("book2", "Author2"));
        library.addBook(new Book("The elder scrolls", "Victor Pinto"));

        // Create Patrons
        Patron patron1 = new Patron("Alex", 1);
        Patron patron2 = new Patron("Emmanuel", 2);

        // List all books
        System.out.println("Books in the Library:");
        library.listBooks();

        // Patron borrows a book
        System.out.println("\nAlex borrows 'book1':");
        if (library.borrowBook("book1", patron1)) {
            System.out.println("Borrowed successfully!");
        } else {
            System.out.println("Book is not available.");
        }

        // List all books after borrowing
        System.out.println("\nBooks in the Library after borrowing:");
        library.listBooks();

        // Alex returning  book1
        System.out.println("\nAlex returns 'book1':");
        if (library.returnBook("book1", patron1)) {
            System.out.println("Returned successfully!");
        } else {
            System.out.println("Return failed.");
        }

        // List all books after returning
        System.out.println("\nBooks in the Library after returning:");
        library.listBooks();
    }
}
    
}
    

