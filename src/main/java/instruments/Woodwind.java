package instruments;

public class Woodwind extends Instrument {

    WoodwindType woodwindType;
    String mouthpiece;

    public Woodwind(
            String description,
            String brand,
            double wholesalePrice,
            double price,
            String material,
            String colour,
            WoodwindType woodwindType,
            String mouthpiece
    ) {
        super(description, brand, wholesalePrice, price, material, colour);
        this.woodwindType = woodwindType;
        this.mouthpiece = mouthpiece;
    }

    @Override
    public String play() {
        return "toot-wah toot-wah toot-waaaah";
    }

    public WoodwindType getType() {
        return woodwindType;
    }

    public void setType(WoodwindType woodwindType) {
        this.woodwindType = woodwindType;
    }

    public String getMouthpiece() {
        return mouthpiece;
    }

    public void setMouthpiece(String mouthpiece) {
        this.mouthpiece = mouthpiece;
    }
}
