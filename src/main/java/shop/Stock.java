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
public class Stock {

    private ArrayList<ISell> items;

    public Stock() {
        this.items = new ArrayList<>();
    }

    public void addItems(ISell item) {
        this.items.add(item);
    }

    public void removeItems(ISell item) {
        this.items.remove(item);
    }

    public ArrayList<ISell> getItems() {
        return new ArrayList<>(this.items); 
    }

    public int getQuantity() {
        return this.items.size();
    }

    public double calcTotPotentialProfit() {
        double profit = 0.00;
        for (ISell item : this.items) {
            profit += item.calculateMarkup();
        }
        return profit;
    }

}
