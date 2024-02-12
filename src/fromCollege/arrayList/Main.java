package fromCollege.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(); //neni nutne udavate velikost
        arrayList.add("asd");
        for (String s : arrayList) {
            System.out.println(s);
        }

        ArrayList<Double> arrayListdouble = new ArrayList<>(); //nelze primo zadat double, nb int protoze numi pracovat primo s primitivnimi datovymi typy. Je nutne proto pouzit obalovaci classu.

        Author zustik = new Author("Daniel", "Zustik");
        Book meda = new Book("Lesni meda", Genre.COMICS, 350, zustik);

        Author potmesil = new Author("Pavel", "Potmesil");
        Book rez = new Book("Rez laserovym nozem", Genre.FANTASY, 300, potmesil);

        Author svatbova = new Author("Pavla", "Svatbova");
        Book killer = new Book("Killer the boss", Genre.HORROR, 450, svatbova);

        Book horrorMedovy = new Book("Lesni meda s vrtakem", Genre.COMICS, 550, zustik);
        Book medaHrozny = new Book("Lesni meda s cervenou u pusy", Genre.COMICS, 550, zustik);

        Bookstore bookstore = new Bookstore();
        bookstore.addBook(meda);
        bookstore.addBook(rez);
        bookstore.addBook(killer);
        bookstore.addBook(horrorMedovy);
        bookstore.addBook(medaHrozny);

        bookstore.printAllbooks();

        System.out.println();
        System.out.println(bookstore.getBookByName("Killer the boss"));

        System.out.println();
        System.out.println(bookstore.booksByGenre(Genre.COMICS)[0]);

    }
}