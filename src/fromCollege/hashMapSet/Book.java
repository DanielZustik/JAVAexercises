package fromCollege.hashMapSet;

public class Book {
    private String name;
    private Author author;
    private int pages;
    private Genre genre;

    public Book(String name, Author author, int pages, Genre genre) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public Genre getGenre() {
        return genre;
    }
}
