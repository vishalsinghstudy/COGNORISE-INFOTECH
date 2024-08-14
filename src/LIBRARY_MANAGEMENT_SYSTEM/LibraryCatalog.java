package LIBRARY_MANAGEMENT_SYSTEM;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
	private List<Book> books;

    public LibraryCatalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.checkOut();
                System.out.println("You have successfully checked out: " + title);
                return;
            }
        }
        System.out.println("Book not available for checkout.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.returnBook();
                System.out.println("You have successfully returned: " + title);
                return;
            }
        }
        System.out.println("Book not found or already returned.");
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
