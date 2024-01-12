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

    public Delivery(){
    }

    public double calculateDelivery(Basket basket){
        double total = 0.00;
        for (ISell i : basket.getItems()) {
                double factor = i.getDeliveryFactor();
                total += factor * DELIVERY_FACTOR;
        }
        return total;
    }


}
