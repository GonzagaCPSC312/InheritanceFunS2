

public class PublicationTester {
    // task: create a Publication class
    // title, publisher, num pages, price
    // DVC, EVC
    // toString() returns the values comma separated
    // no getters or setters
    // then create a few Publications to test it out
    public static void main(String[] args) {
//        Publication publication = new Publication();
//        System.out.println(publication);

        Book b1 = new Book();
        System.out.println(b1);
        Book b2 = new Book("Tolkein");
        System.out.println(b2);
        System.out.println(b2.generateCopyright());

        Magazine m1 = new Magazine();
        System.out.println(m1);
        System.out.println(m1.generateCopyright());

        // polymorphism demo
        Publication p1 = m1; // p1 is an alias for the same object m1 refers
        Publication[] pubs = new Publication[5];
        pubs[0] = b1;
        pubs[1] = b2;
        pubs[2] = m1;
        pubs[3] = p1; // refers to a Magazine object
        Publication anonyPub = new Publication() {
            @Override
            public String generateCopyright() {
                return "TODO: to be implemented in Anonymous Class";
            }
        };
        pubs[4] = anonyPub;
        // polymorphism: same code, different behavior
        for (Publication pub : pubs) {
            System.out.println(pub); // dynamic binding
            // at runtime, the Publication reference pub resolves
            // to the more specific object it refers to
            System.out.println(pub.generateCopyright());
            System.out.println(pub.getClass());
            System.out.println("****");
        }
    }
}
