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
public class BasketTest {

    private Basket basket;
    private Guitar guitar;

    @BeforeEach
    public void setUp() {

        basket = new Basket();
        guitar = new Guitar("Guitarra Acústica", "Yamaha", 100, 200,
                "Madera", "Celeste", 6, GuitarType.ACOUSTIC, 10, 5);
    }

    @Test
    public void testAdd() {
        basket.add(guitar);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void testRemove() {
        basket.add(guitar);
        basket.remove(guitar);
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testGetItems() {
        basket.add(guitar);
        ArrayList<ISell> result = basket.getItems();
        assertTrue(result.contains(guitar));
    }

    @Test
    public void testCountItemsWithNoItems() {
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testCountItemsWithItems() {
        Guitar guitar2 = new Guitar("Guitarra Eléctrica", "Don Lucho", 500.0, 1000.0, 
                "Obsidiana", "Negro", 6, GuitarType.ELECTRIC, 2, 1);
        basket.add(guitar);
        basket.add(guitar2);
        assertEquals(2, basket.countItems());
    }

    @Test
    public void testGetAmount() {
        basket.add(guitar);
        assertEquals(200.0, basket.getAmount());
    }

}
