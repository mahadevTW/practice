import Biblioteca.Book;
import Biblioteca.Config;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mahadev on 17/5/16.
 */
public class BookTest {
    @Test
    public void bookShouldReturnBookDetailsOnToStringMethodCall(){
        Book book = new Book(Config.DUMMY_BOOK_NAME,Config.DUMMY_BOOK_AUTHOR,Config.DUMMY_BOOK_YEAR_PUBLISHED);
        assertEquals("Book Name:"+Config.DUMMY_BOOK_NAME+" Author :"+Config.DUMMY_BOOK_AUTHOR+" Published Year: "+Config.DUMMY_BOOK_YEAR_PUBLISHED,book.toString());
    }
}
