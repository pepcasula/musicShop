package accessories;

public class PartSpare extends Accessory{

    SparePartType sparePartType;

    public PartSpare(
            String description,
            String brand,
            double wholesalePrice,
            double price,
            SparePartType sparePartType
    ) {
        super(description, brand, wholesalePrice, price);
        this.sparePartType = sparePartType;
    }

    public SparePartType getSparePartType() {
        return sparePartType;
    }

    public void setSparePartType(SparePartType sparePartType) {
        this.sparePartType = sparePartType;
    }
}
