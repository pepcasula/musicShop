package sheet_music_and_books;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book(
                "William Francis.F. Allen",
                "Slave songs of the United States. The classic 1867 Anthology",
                BookGenre.MUSIC_HISTORY,
                "Dover Publications",
                192,
                8.50,
                11.00
        );
    }

    @Test
    public void canGetMarkup(){
        assertEquals(2.50, book.calculateMarkup(), 0.0);
    }

    @Test
    public void canGetWholesalePrice(){
        assertEquals(8.50, book.getWholesalePrice(), 0.0);
    }

    @Test
    public void canSetWholesalePrice(){
        book.setWholesalePrice(7.50);
        assertEquals(7.50, book.getWholesalePrice(), 0.0);
    }

    @Test
    public void canGetPrice(){
        assertEquals(11.00, book.getPrice(), 0.0);
    }

    @Test
    public void canSetPrice(){
        book.setPrice(13.90);
        assertEquals(13.90, book.getPrice(), 0.0);
    }

    @Test
    public void canGetAuthor(){
        assertEquals("William Francis.F. Allen", book.getAuthor());
    }

    @Test
    public void canSetAuthor(){
        book.setAuthor("Lucy McKim Garrison, Charles Pickard Ware");
        assertEquals("Lucy McKim Garrison, Charles Pickard Ware", book.getAuthor());
    }

    @Test
    public void canGetTitle(){
        assertEquals("Slave songs of the United States. The classic 1867 Anthology", book.getTitle());
    }

    @Test
    public void canSetTitle(){
        book.setTitle("Life of Chopin");
        assertEquals("Life of Chopin", book.getTitle());
    }

    @Test
    public void canGetGenre(){
        assertEquals(BookGenre.MUSIC_HISTORY, book.getGenre());
    }

    @Test
    public void canSetGenre(){
        book.setGenre(BookGenre.EDUCATIONAL);
        assertEquals(BookGenre.EDUCATIONAL, book.getGenre());
    }

    @Test
    public void canGetPublisher(){
        assertEquals("Dover Publications", book.getPublisher());
    }

    @Test
    public void canSetPublisher(){
        book.setPublisher("Oxford University Press");
        assertEquals("Oxford University Press", book.getPublisher());
    }

    @Test
    public void canGetPages(){
        assertEquals(192, book.getPages());
    }

    @Test
    public void canSetPages(){
        book.setPages(132);
        assertEquals(132, book.getPages());
    }
}
