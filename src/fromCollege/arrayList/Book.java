package fromCollege.arrayList;

public class Book {
    private String name;
    private Genre genre;
    private int price;
    private Author author;

    public Book(String name, Genre genre, int price, Author author) {
        this.name = name;
        this.genre = genre;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return name +
                ", genre=" + genre +
                ", price=" + price +
                ", author=" + author
                ;
    }
}
