package fromCollege.hashMapSet;

public class Main {
    public static void main(String[] args) {
        Author shakespeare = new Author("William", "Shakespeare");
        Author asimov = new Author("Isaac", "Asimov");
        Author rowling = new Author("J. K.", "Rowling");

        Book hamlet = new Book("Hamlet", shakespeare, 240, Genre.DRAMA);
        Book f = new Book("Nadace", asimov, 310, Genre.SCIFI);
        Book hp1 = new Book("Harry Potter a kámen mudrců", rowling, 280, Genre.FANTASY);
        Book hp2 = new Book("Harry Potter a tajemná komnata", rowling, 300, Genre.FANTASY);
        Book hp3 = new Book("Harry Potter a vězeň z Azkabanu", rowling, 360, Genre.FANTASY);

        Library library = new Library();
        library.add(hamlet);
        library.add(f);
        library.add(hp1);
        library.add(hp2);
        library.add(hp3);

        System.out.println(library.getAuthorSurnames());
        System.out.println(library.getAuthorBooksCount());
    }
}
