/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        // Create Library
        Library library = new Library();

        // Add Books
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        // Create Patrons
        Patron patron1 = new Patron("Alice", 1);
        Patron patron2 = new Patron("Bob", 2);

        // List all books
        System.out.println("Books in the Library:");
        library.listBooks();

        // Patron borrows a book
        System.out.println("\nAlice borrows '1984':");
        if (library.borrowBook("1984", patron1)) {
            System.out.println("Borrowed successfully!");
        } else {
            System.out.println("Book is not available.");
        }

        // List all books after borrowing
        System.out.println("\nBooks in the Library after borrowing:");
        library.listBooks();

        // Alice returns the book
        System.out.println("\nAlice returns '1984':");
        if (library.returnBook("1984", patron1)) {
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
    

