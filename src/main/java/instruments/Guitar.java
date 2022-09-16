package instruments;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;
    private GuitarType guitarType;

    public Guitar(
            String description,
            String brand,
            double wholesalePrice,double price,
            String material,
            String colour,
            int numberOfStrings,
            GuitarType guitarType
    ) {
        super(description, brand, wholesalePrice, price, material, colour);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public String play(){
        return "twang twang strum wah wah";
    }

    public int getStrings() {
        return numberOfStrings;
    }

    public void setStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public GuitarType getType() {
        return guitarType;
    }

    public void setType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }
}

