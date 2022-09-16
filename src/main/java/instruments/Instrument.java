package instruments;

import shop.ISell;

public abstract class Instrument implements ISell {

    private String description;
    private String brand;
    private double wholesalePrice;
    private double price;
    private String material;
    private String colour;

    public Instrument(String description, String brand, double wholesalePrice, double price, String material, String colour) {
        this.description = description;
        this.brand = brand;
        this.wholesalePrice = wholesalePrice;
        this.price = price;
        this.material = material;
        this.colour = colour;
    }

    public double calculateMarkup() {
        return this.price - this.wholesalePrice;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
