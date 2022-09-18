package accessories;

import instruments.IPlay;
import shop.ISell;

public abstract class Accessory implements ISell {

    private String description;
    private String brand;
    private double wholesalePrice;
    private double price;
    private int deliveryFactor;
    private int setupFactor;
    private int insuranceFactor;

    public Accessory(
            String description,
            String brand,
            double wholesalePrice,
            double price,
            int deliveryFactor,
            int setupFactor
    ) {
        this.description = description;
        this.brand = brand;
        this.wholesalePrice = wholesalePrice;
        this.price = price;
        this.deliveryFactor = deliveryFactor;
        this.setupFactor = setupFactor;
        this.insuranceFactor = ((int)Math.round(this.price)) / 25;
    }

    public double calculateMarkup() {
        return this.price - this.wholesalePrice;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDeliveryFactor() {
        return deliveryFactor;
    }

    public void setDeliveryFactor(int deliveryFactor) {
        this.deliveryFactor = deliveryFactor;
    }

    public int getSetupFactor() {
        return setupFactor;
    }

    public void setSetupFactor(int setupFactor) {
        this.setupFactor = setupFactor;
    }

    public int getInsuranceFactor(){
        return this.insuranceFactor;
    }

}
