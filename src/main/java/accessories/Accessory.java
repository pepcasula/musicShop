package accessories;

import shop.ISell;

public abstract class Accessory implements ISell {

    private String description;
    private String brand;
    private double wholesalePrice;
    private double price;

    public Accessory(String description, String brand, double wholesalePrice, double price) {
        this.description = description;
        this.brand = brand;
        this.wholesalePrice = wholesalePrice;
        this.price = price;
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

}