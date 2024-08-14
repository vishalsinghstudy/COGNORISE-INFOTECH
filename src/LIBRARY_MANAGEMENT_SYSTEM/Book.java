package LIBRARY_MANAGEMENT_SYSTEM;

public class Book {
	private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is already checked out.");
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Status: " + (isAvailable ? "Available" : "Checked Out");
    }

}
