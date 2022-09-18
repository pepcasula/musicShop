package accessories;

public class OtherAccessory extends Accessory {

    OtherCategory otherCategory;

    public OtherAccessory(
            String description,
            String brand,
            double wholesalePrice,
            double price,
            OtherCategory otherCategory,
            int deliveryFactor,
            int setupFactor
    ) {
        super(
                description,
                brand,
                wholesalePrice,
                price,
                deliveryFactor,
                setupFactor
        );
        this.otherCategory = otherCategory;
    }

    public OtherCategory getType() {
        return otherCategory;
    }

    public void setType(OtherCategory itemCategory) {
        this.otherCategory = itemCategory;
    }
}
