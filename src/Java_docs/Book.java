package Java_docs;

/**
 * The Book class represents a book with a title, author, and number of pages.
 * It provides methods to retrieve and modify these details.
 */
public class Book {

    private String title;
    private String author;
    private int pages;

    /**
     * Constructs a new Book with the specified title, author, and number of pages.
     *
     * @param title  The title of the book.
     * @param author The author of the book.
     * @param pages  The number of pages in the book.
     */
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The new title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The new author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the number of pages in the book.
     *
     * @return The number of pages in the book.
     */
    public int getPages() {
        return pages;
    }

    /**
     * Sets the number of pages in the book.
     *
     * @param pages The new number of pages in the book.
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * Returns a string representation of the book, including its title, author, and number of pages.
     *
     * @return A string representation of the book.
     */
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", pages=" + pages + "]";
    }

    /**
     * The main method demonstrates the creation and use of the Book class.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Book myBook = new Book("Java Basics", "John Doe", 250);
        System.out.println(myBook);

        myBook.setTitle("Advanced Java");
        myBook.setPages(500);
        System.out.println("Updated Book: " + myBook);
    }
}
