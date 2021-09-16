


// Book is a more specific version of a Publication
// Books have authors, but not all Publications do
public class Book extends Publication {
    protected String author;

    // inheritance: a relationship between 2 classes where 1 class
    // inherits (AKA includes) the state AND behavior of the other class
    // Book also has title, publisher, numPages, price

    // DVC
    public Book() {
        // implicitly Publication's DVC is called to initialize
        // Publication state first
        super(); // can explicitly call it
        author = "BLANK AUTHOR";
    }

    // EVC #1
    public Book(String author) {
        super(); // optional
        this.author = author;
    }

    // EVC #2
    public Book(String title, String publisher, int numPages, double price, String author) {
        super(title, publisher, numPages, price); // Publication's EVC
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + author; // whenever possible, reuse super class code
    }
}
