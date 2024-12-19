
public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a Book to the Library
    public void addBook(Book book) {
        books.add(book);
    }

    // Borrow a Book
    public boolean borrowBook(String title, Patron patron) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.setAvailable(false);
                patron.borrowBook(title);
                return true;
            }
        }
        return false;
    }

    // Return a Book
    public boolean returnBook(String title, Patron patron) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.setAvailable(true);
                patron.returnBook(title);
                return true;
            }
        }
        return false;
    }

    // List all Books
    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + 
                (book.isAvailable() ? " (Available)" : " (Borrowed)"));
        }
    }
}

