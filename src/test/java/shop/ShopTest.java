package shop;

import accessories.*;
import instruments.*;
import org.junit.Before;
import org.junit.Test;
import sheet_music_and_books.Book;
import sheet_music_and_books.BookGenre;
import sheet_music_and_books.MusicGenre;
import sheet_music_and_books.SheetMusic;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Woodwind woodwind;
    Case1 case1;
    OtherAccessory otherAccessory;
    SparePart sparePart;
    Book book;
    SheetMusic sheetMusic;

    @Before
    public void before(){

        guitar = new Guitar(
                "Bass Guitar SR600E",
                "Ibanez",
                665.00,
                790.00,
                "Ash",
                "Antique brown stain burst",
                4,
                GuitarType.ELECTRIC_BASS,
                4,
                2
        );

        piano = new Piano(
                "Grand Piano GB1K",
                "Yamaha",
                10750.00,
                12200.00,
                "Wood",
                "Ebony",
                88,
                PianoType.GRAND,
                10,
                10
        );

        woodwind = new Woodwind(
                "Alto Saxophone SA80 Series II",
                "Selmer Paris",
                4240.00,
                4990.00,
                "Brass",
                "Gold",
                WoodwindType.SAXOPHONE,
                "Selmer S80 C",
                4,
                4
        );

        case1 = new Case1(
                "Bass Guitar Bag KPEB99",
                "Kinsman",
                42.90,
                54.90,
                CaseType.GUITAR_BAG,
                "Brown",
                2,
                0
        );

        otherAccessory = new OtherAccessory(
                "Monitoring Headphones HD25 Plus",
                "Sennheiser",
                125.90,
                169.90,
                OtherCategory.STUDIO_EQUIPMENT,
                1,
                0
        );

        sparePart = new SparePart(
                "22\" Bass Drumhead PTH-22PL",
                "Pearl",
                38.90,
                47.90,
                SparePartType.DRUMS_PART,
                2,
                0
        );

        book = new Book(
                "William Francis.F. Allen",
                "Slave songs of the United States. The classic 1867 Anthology",
                BookGenre.MUSIC_HISTORY,
                "Dover Publications",
                192,
                8.50,
                11.00,
                1,
                0
        );

        sheetMusic = new SheetMusic(
                "The Jazz Sax Collection",
                "For saxophone and piano, arranged by Ned Bennett",
                MusicGenre.JAZZ,
                "Faber Music",
                27,
                9.50,
                13.00,
                1,
                0
        );

        shop = new Shop();

        shop.addItemsToStock(guitar);
        shop.addItemsToStock(piano);
        shop.addItemsToStock(case1);
        shop.addItemsToStock(otherAccessory);

    }

    @Test
    public void canAddToStock(){
        shop.addItemsToStock(sparePart);
        shop.addItemsToStock(book);
        shop.addItemsToStock(sheetMusic);
        assertEquals(7, shop.getStockQuantity());
    }

    @Test
    public void canRemoveFromStock(){
        shop.removeItemsFromStock(piano);
        assertEquals(3, shop.getStockQuantity());
    }

    @Test
    public void canClearStock(){
        shop.clearStock();
        assertEquals(0, shop.getStockQuantity());
    }

    @Test
    public void canGetStockQuantity(){
        assertEquals(4, shop.getStockQuantity());
    }

    @Test
    public void canGetTotPotentialProfit(){
        shop.addItemsToStock(woodwind);
        shop.addItemsToStock(sparePart);
        shop.addItemsToStock(book);
        shop.addItemsToStock(sheetMusic);
        assertEquals(2396.00, shop.calcTotPotentialProfit(), 0.0);
    }

    @Test
    public void willNotAddToBasketIfNotInStock(){
        shop.addToBasket(guitar);       // in stock
        shop.addToBasket(woodwind);     // not in stock
        shop.addToBasket(book);         //not in stock
        assertEquals(1, shop.countBasketItems());
    }

    @Test
    public void canAddToBasket(){
        shop.addToBasket(guitar);
        shop.addToBasket(case1);
        assertEquals(2, shop.countBasketItems());
    }

    @Test
    public void canRemoveFromBasket(){
        shop.addToBasket(guitar);
        shop.addToBasket(case1);
        shop.removeFromBasket(case1);
        assertEquals(1, shop.countBasketItems());
    }

    @Test
    public void canClearBasket(){
        shop.addToBasket(guitar);
        shop.addToBasket(case1);
        assertFalse(shop.countBasketItems() == 0);
        shop.clearBasket();
        assertTrue(shop.countBasketItems() == 0);
    }

    @Test
    public void canCountBasketItems(){
        shop.addToBasket(guitar);
        assertTrue(shop.countBasketItems() == 1);
    }

    @Test
    public void canCheckout(){
        shop.addToBasket(guitar);
        shop.addToBasket(case1);
        shop.addToBasket(otherAccessory);
        assertEquals(1014.80, shop.checkout(), 0.0);
    }

}
