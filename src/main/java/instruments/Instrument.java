package instruments;

import shop.ShopItem;

public class Instrument extends ShopItem {

    private String material;
    private String colour;

    public Instrument(String description, String brand, double wholesalePrice, double price, String material, String colour) {
        super(description, brand, wholesalePrice, price);
        this.material = material;
        this.colour = colour;
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
