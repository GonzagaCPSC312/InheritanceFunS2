


// abstract class: a class that cannot be instantiated
// Publication is too general to be instantiated
// we will make subclasses of Publication and instantiate those
public abstract class Publication {
    // fields
    protected String title;
    protected String publisher;
    protected int numPages;
    protected double price;

    // DVC
    public Publication() {
        title = "BLANK TITLE";
        publisher = "BLANK PUBLISHER";
        numPages = -1;
        price = 0.0;
    }

    // EVC
    public Publication(String title, String publisher, int numPages, double price) {
        this.title = title;
        this.publisher = publisher;
        this.numPages = numPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + ", " + publisher + ", " + numPages + ", " + price;
    }

    // abstract method: a method without a body that
    // a subclass must override
    // lets say that all Publications must have a generateCopyright() method
    public abstract String generateCopyright();

}
