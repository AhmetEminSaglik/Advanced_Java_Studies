package examples.example5_Factory;

public class Factory {
    public class Library implements BookFactory {

        @Override
        public Book newBook() {
            return null; //return new PaperBook();
        }
    }

    public class KindleLibrary implements BookFactory{

        @Override
        public Book newBook() {
            return null; //return new KindleBook();
        }
    }
}
