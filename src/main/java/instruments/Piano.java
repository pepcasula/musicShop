package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;
    private PianoType pianoType;

    public Piano(
            String description,
            String brand,
            double wholesalePrice,
            double price,
            String material,
            String colour,
            int numberOfKeys,
            PianoType pianoType
    ) {
        super(description, brand, wholesalePrice, price, material, colour);
        this.numberOfKeys = numberOfKeys;
        this.pianoType = pianoType;
    }

    @Override
    public String play(){
        return "plink-a-plink-a-plink-a-plink";
    }

    public int getKeys() {
        return numberOfKeys;
    }

    public void setKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public PianoType getType() {
        return pianoType;
    }

    public void setType(PianoType pianoType) {
        this.pianoType = pianoType;
    }
}
