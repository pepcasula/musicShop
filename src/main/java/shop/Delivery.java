/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;

/**
 *
 * @author johan
 */
public class Delivery {

    private static final double DELIVERY_FACTOR = 5.0;
    private ISell item;

    public Delivery(ISell item) {
        this.item = item;
    }

    public double calculateDelivery(Basket basket){
        double total = 0.00;
        for (ISell i : basket.getItems()) {
            if (i == this.item) {
                double factor = item.getDeliveryFactor();
                total += factor * DELIVERY_FACTOR;
            }
        }
        return total;
    }


}
