class Book {
    String title;
    String author;
    int pages;

    Book() {
        title = "Unknown Title";
        author = "Anonymous";
        pages = 100;
    }
    Book(String t, String a) {
        title = t;
        author = a;
        pages = 200;
    }
    Book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
    }
    void displayBook() {
        System.out.println("Book: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}

public class Constructoroverloading {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling");
        Book b3 = new Book("Effective Java", "Joshua Bloch", 416);
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}
