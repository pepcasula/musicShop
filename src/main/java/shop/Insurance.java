/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;

/**
 *
 * @author johan
 */
public class Insurance {

    private static final double INSURANCE_FACTOR = 5.0;
    private ISell item;

    public Insurance(ISell item) {
        this.item = item;
    }

    public double calculateCost(Basket basket) {
        double insurance = 0.00;
        double factor = item.getInsuranceFactor();
        if (basket.getItems().contains(this.item) && factor >= INSURANCE_FACTOR) {
            insurance = factor;
        }
        return insurance;
    }
}
