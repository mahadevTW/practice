package Biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mahadev on 17/5/16.
 */
public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public boolean checkoutBook(String s) {
        Iterator<Book> bookIterator = books.iterator();
        while (bookIterator.hasNext()){
        Book book = bookIterator.next();
        if(book.getName().equals(s)){
            books.remove(book);
            return true;
        }
        }
        return false;
    }

    public int getBookCount() {
        return books.size();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean isBookPresent(String bookName) {
        Iterator<Book> bookIterator = books.iterator();
        while (bookIterator.hasNext()){
            Book book = bookIterator.next();
            if(book.getName().equals(bookName)){
                return true;

            }
        }
        return false;
    }
}
