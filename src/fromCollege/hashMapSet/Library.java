package fromCollege.hashMapSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void add (Book book) {
        books.add(book);
    }

    public ArrayList<String> getAuthorSurnames () {
        HashSet<String> authorSurnames = new HashSet<>();

        for (Book book : books) {
            authorSurnames.add(book.getAuthor().getSurname());
        }

        return new ArrayList<>(authorSurnames);
    }

    public HashMap<String, Integer> getAuthorBooksCount () {
        HashMap<String, Integer> authorBooksCount = new HashMap<>();

        for (Book b : books) {
            String surname = b.getAuthor().getSurname();

            if (authorBooksCount.containsKey(surname)) {
                authorBooksCount.put(surname, authorBooksCount.get(surname) + 1);
            } else {
                authorBooksCount.put(surname, 1);
            }
        }

        return authorBooksCount;
    }
}
