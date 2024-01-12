/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package shop;

import instruments.Guitar;
import instruments.GuitarType;
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
public class DeliveryTest {

    private Delivery delivery;
    private Basket basket;

    @BeforeEach
    public void setUp() {
        basket = new Basket();
        Guitar guitar = new Guitar("Guitarra Semi Acústica", "GuayaquilGuitars", 300, 1000,
                "Madera", "Negro", 6, GuitarType.SEMI_ACOUSTIC, 2, 1);
        basket.add(guitar);
        delivery = new Delivery();
    }

    @Test
    public void testCalculateDelivery() {
        assertEquals(10.0, delivery.calculateDelivery(basket), 0);
    }

    @Test
    public void testCalculateDeliveryWithMultipleItems() {
        Guitar guitar2 = new Guitar("Guitarra Semi Acústica", "GuayaquilGuitars", 300, 1000,
                "Madera", "Negro", 6, GuitarType.SEMI_ACOUSTIC, 3, 1);
        basket.add(guitar2);
        assertEquals(25, delivery.calculateDelivery(basket), 0);
    }

}
