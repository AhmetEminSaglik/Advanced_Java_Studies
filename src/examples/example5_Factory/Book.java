package examples.example5_Factory;

public class Book {
    private Book(final String title) {
    }

    public static Book newBook(final String title) {
        return new Book(title);
    }

}
