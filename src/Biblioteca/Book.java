package Biblioteca;

/**
 * Created by mahadev on 17/5/16.
 */
public class Book {
    private String name;
    private String author;
    private int yearPublished;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "Book Name:" + name + " Author :" + author + " Published Year: " + yearPublished;
    }

    public Book(String name, String author, int yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }
}
