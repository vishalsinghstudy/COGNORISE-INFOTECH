package LIBRARY_MANAGEMENT_SYSTEM;

public class LibraryManagementSystem {
	    public static void main(String[] args) {
	        LibraryCatalog catalog = new LibraryCatalog();

	        // Adding books to the catalog
	        catalog.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
	        catalog.addBook(new Book("1984", "George Orwell"));
	        catalog.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

	        // Display all books
	        System.out.println("All books in the catalog:");
	        catalog.displayAllBooks();

	        // Search by title
	        System.out.println("\nSearch results for title '1984':");
	        for (Book book : catalog.searchByTitle("1984")) {
	            System.out.println(book);
	        }

	        // Search by author
	        System.out.println("\nSearch results for author 'Harper Lee':");
	        for (Book book : catalog.searchByAuthor("Harper Lee")) {
	            System.out.println(book);
	        }

	        // Check out a book
	        System.out.println("\nChecking out '1984':");
	        catalog.checkOutBook("1984");

	        // Try to check out the same book again
	        System.out.println("\nTrying to check out '1984' again:");
	        catalog.checkOutBook("1984");

	        // Return a book
	        System.out.println("\nReturning '1984':");
	        catalog.returnBook("1984");

	        // Display all books after operations
	        System.out.println("\nAll books in the catalog after operations:");
	        catalog.displayAllBooks();
	    }
	

}
