/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;

import java.util.ArrayList;

/**
 *
 * @author johan
 */
public class Basket {

    private ArrayList<ISell> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void add(ISell item) {
        this.items.add(item);
    }

    public void remove(ISell item) {
        this.items.remove(item);
    }

    public ArrayList<ISell> getItems() {
        return new ArrayList<>(this.items);
    }

    public int countItems() {
        return this.items.size();
    }

    public double getAmount() {
        double basketAmount = 0.00;
        for (ISell item : this.items) {
            basketAmount += item.getPrice();
        }
        return basketAmount;
    }

}
