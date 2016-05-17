import Biblioteca.Book;
import Biblioteca.Config;
import Biblioteca.Library;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
public class BookTest {
    @Test
    public void bookShouldReturnBookDetailsOnToStringMethodCall(){
        Book book = new Book(Config.DUMMY_BOOK_NAME,Config.DUMMY_BOOK_AUTHOR,Config.DUMMY_BOOK_YEAR_PUBLISHED);
        assertEquals("Book Name:"+Config.DUMMY_BOOK_NAME+" Author :"+Config.DUMMY_BOOK_AUTHOR+" Published Year: "+Config.DUMMY_BOOK_YEAR_PUBLISHED,book.toString());
    }
    @Test
    public void checkoutMethodShouldReduceBookCountByOneFromLibraryIfSuccessfulCheckout(){
        Library library = new Library();
        library.addBook(new Book("Who will cry When You die","Robin Sharma",1995));
        library.addBook(new Book("life is what you make it","",2007));
        int bookCount = library.getBookCount();
        assertEquals(true, library.checkoutBook("Who will cry When You die"));
        assertEquals(library.getBookCount(), bookCount - 1);
    }
    @Test
    public void addbookShouldAddPassedBookToLibrary(){
        Library library = new Library();
        library.addBook(new Book(Config.DUMMY_BOOK_NAME,Config.DUMMY_BOOK_AUTHOR,Config.DUMMY_BOOK_YEAR_PUBLISHED));
        assertEquals(library.isBookPresent(Config.DUMMY_BOOK_NAME),true);
    }
}
