package ua.com.alevel;


import java.util.ArrayList;
import java.util.List;

public class BookService {

    public static void main(String[] args) {
        List<Album> booksSource = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();
        copyToBooks(booksSource, booksDestination);
    }

    //public static void copyToBooks(List<Book> src, List<Book> dest) {
    public static <T> void copyToBooks(List<? extends T> src, List<? super T> dest) {
        for (T book : src) {
            dest.add(book);
        }
    }
}

