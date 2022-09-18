package accessories;

public class SparePart extends Accessory{

    SparePartType sparePartType;

    public SparePart(
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
