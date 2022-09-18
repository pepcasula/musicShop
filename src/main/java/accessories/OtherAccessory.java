package accessories;

public class OtherAccessory extends Accessory {

    OtherCategory otherCategory;

    public OtherAccessory(
            String description,
            String brand,
            double wholesalePrice,
            double price,
            OtherCategory otherCategory
    ) {
        super(description, brand, wholesalePrice, price);
        this.otherCategory = otherCategory;
    }

    public OtherCategory getType() {
        return otherCategory;
    }

    public void setType(OtherCategory itemCategory) {
        this.otherCategory = itemCategory;
    }
}
