package Biblioteca;

/**
 * Created by mahadev on 17/5/16.
 */
public class Book {
    private String name;
    private String author;
    private String yearPublished;

    @Override
    public String toString() {
        return "Book Name:" + name + " Author :" + author + " Published Year: " + yearPublished;
    }

    public Book(String name, String author, String yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }
}
