package accessories;

public class OtherAccessory extends Accessory {

    ItemCategory itemCategory;

    public OtherAccessory(
            String description,
            String brand,
            double wholesalePrice,
            double price,
            ItemCategory itemCategory
    ) {
        super(description, brand, wholesalePrice, price);
        this.itemCategory = itemCategory;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }
}
