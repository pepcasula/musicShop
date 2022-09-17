package shop;

import accessories.*;
import instruments.*;
import org.junit.Before;
import org.junit.Test;
import sheet_music_and_books.Book;
import sheet_music_and_books.BookGenre;
import sheet_music_and_books.MusicGenre;
import sheet_music_and_books.SheetMusic;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Woodwind woodwind;
    Case case1;
    OtherAccessory otherAccessory;
    PartSpare partSpare;
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
                GuitarType.ELECTRIC_BASS
        );

        piano = new Piano(
                "Grand Piano GB1K",
                "Yamaha",
                10750.00,
                12200.00,
                "Wood",
                "Ebony",
                88,
                PianoType.GRAND
        );

        woodwind = new Woodwind(
                "Alto Saxophone SA80 Series II",
                "Selmer Paris",
                4240.00,
                4990.00,
                "Brass",
                "Gold",
                WoodwindType.SAXOPHONE,
                "Selmer S80 C"
        );

        case1 = new Case(
                "Bass Guitar Bag KPEB99",
                "Kinsman",
                42.90,
                54.90,
                CaseType.GUITAR_BAG
        );

        otherAccessory = new OtherAccessory(
                "Monitoring Headphones HD25 Plus",
                "Sennheiser",
                125.90,
                169.90,
                ItemCategory.STUDIO_EQUIPMENT
        );

        partSpare = new PartSpare(
                "22\" Bass Drumhead PTH-22PL",
                "Pearl",
                38.90,
                47.90,
                SparePartType.DRUM_PART
        );

        book = new Book(
                "William Francis.F. Allen",
                "Slave songs of the United States. The classic 1867 Anthology",
                BookGenre.MUSIC_HISTORY,
                "Dover Publications",
                192,
                8.50,
                11.00
        );

        sheetMusic = new SheetMusic(
                "The Jazz Sax Collection",
                "For saxophone and piano, arranged by Ned Bennett",
                MusicGenre.JAZZ,
                "Faber Music",
                27,
                9.50,
                13.00
        );

        shop = new Shop();

        shop.addItemsToStock(guitar);
        shop.addItemsToStock(piano);
        shop.addItemsToStock(case1);
        shop.addItemsToStock(otherAccessory);

    }

    @Test
    public void canAddToStock(){
        shop.addItemsToStock(partSpare);
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
        shop.addItemsToStock(partSpare);
        shop.addItemsToStock(book);
        shop.addItemsToStock(sheetMusic);
        assertEquals(2396.00, shop.calcTotPotentialProfit(), 0.0);
    }
}
