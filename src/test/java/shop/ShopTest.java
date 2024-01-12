/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package shop;

import instruments.Guitar;
import instruments.GuitarType;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author johan
 */
public class ShopTest {

    private Shop shop;
    private ArrayList<ISell> list;
    private Guitar guitar;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        guitar = new Guitar("Guitarra", "QuitoGuitars", 99999, 99999,
                "Diamante", "Diamante", 6, GuitarType.CLASSICAL, 1, 1);
        list = new ArrayList<>();
        list.add(guitar);
    }

    @Test
    public void testClearList() {
        shop.clearList(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testClearListBasket() {
        shop.clearList(shop.getBasket().getItems());
        assertTrue(shop.getBasket().getItems().isEmpty());
    }

    @Test
    public void testClearListStock() {
        shop.clearList(shop.getStock().getItems());
        assertTrue(shop.getStock().getItems().isEmpty());
    }

    @Test
    public void testGetStock() {
        assertTrue(shop.getStock() instanceof Stock);
    }

    @Test
    public void testGetBasket() {
        assertTrue(shop.getBasket() instanceof Basket);
    }

}
