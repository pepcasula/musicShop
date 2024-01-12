/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;

/**
 *
 * @author johan
 */
public class Setup {

    private static final double SETUP_FACTOR = 12.0;
    private double factor;

    public Setup(double factor) {
        this.factor = factor;
    }

    public double calculateCost(Basket basket, ISell item) {
        double setupCost = 0;
        if (basket.getItems().contains(item) && this.factor != 0) {
            setupCost = this.factor * SETUP_FACTOR;
        }
        return setupCost;
    }
}
