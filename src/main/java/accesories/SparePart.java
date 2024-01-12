package accessories;

public class SparePart extends Accessory{

    SparePartType sparePartType;

    public SparePart(
            String description,
            String brand,
            double wholesalePrice,
            double price,
            SparePartType sparePartType,
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
        this.sparePartType = sparePartType;
    }

    public SparePartType getSparePartType() {
        return sparePartType;
    }

    public void setSparePartType(SparePartType sparePartType) {
        this.sparePartType = sparePartType;
    }
}
