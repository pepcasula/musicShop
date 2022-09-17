package shop;

import instruments.Guitar;
import instruments.GuitarType;
import instruments.Piano;
import instruments.PianoType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;

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
        shop = new Shop();
    }

    @Test
    public void canAddToStock(){
        shop.addItemsToStock(piano);
        assertEquals(1, shop.getStockQuantity());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addItemsToStock(guitar);
        shop.addItemsToStock(piano);
        shop.removeItemsFromStock(piano);
        assertEquals(1, shop.getStockQuantity());
    }

    @Test
    public void canClearStock(){
        shop.addItemsToStock(guitar);
        shop.clearStock();
        assertEquals(0, shop.getStockQuantity());
    }

    @Test
    public void canGetStockQuantity(){
        shop.addItemsToStock(guitar);
        shop.addItemsToStock(piano);
        assertEquals(2, shop.getStockQuantity());
    }

    @Test
    public void canGetTotPotentialProfit(){
        shop.addItemsToStock(guitar);
        shop.addItemsToStock(piano);
        assertEquals(1575.00, shop.calcTotPotentialProfit(), 0.0);
    }
}
