package fromCollege.arrayList;

import java.util.ArrayList;

public class Bookstore {
    private ArrayList<Book> books;

    public Bookstore () {
        this.books = new ArrayList<>();
    }

    public void addBook (Book book) {
        books.add(book);
    }

    public void printAllbooks () {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book getBookByName (String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

    public double averagePriceOfBooks () {
        double sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }

        return sum / books.size();
    }

    public Book[] booksByGenre (Genre genre) {
        ArrayList<Book> booksByGenre = new ArrayList<>();

        for (Book book : books) {
            if (book.getGenre() == genre) {
                booksByGenre.add(book);
            }
        }
        return booksByGenre.toArray(Book[]::new); //takto se prevede arraylist zpatky na pole a tak mohu splnit zadani, protoze tam bylo, ze mam vratit pole a ne arraylist.. nb se da new Book[0] reps jakekoliv cislo
    }

    public Book[] booksUnderPrice (int price) {
        ArrayList<Book> booksUnderPrice = new ArrayList<>();

        for (Book book : books) {
            if (book.getPrice() < price) {
                booksUnderPrice.add(book);
            }
        }

        return booksUnderPrice.toArray(new Book[0]);
    }

    public Book[] booksByAuthor (String surname) {
        ArrayList<Book> booksByAuthor = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getAuthor().getSurname().equals(surname)) {
                booksByAuthor.add(book);
            }
        }

        return booksByAuthor.toArray(new Book[0]);
    }

    
}
