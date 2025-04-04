class Movie {
    String name;
    double rating;
    Movie(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    Movie(Movie m) {
        this.name = m.name;
        this.rating = m.rating;
    }
    void display() {
        System.out.println("Movie: " + name + ", Rating: " + rating);
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", 8.8);
        Movie m2 = new Movie("Interstellar", 8.6);
        m1.display();
        m2.display();
    }
}
