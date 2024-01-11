package accessories;

public class Case1 extends Accessory {

    CaseType caseType;
    String colour;

    public Case1(
            String description,
            String brand,
            double wholesalePrice,
            double price,
            CaseType caseType,
            String colour,
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
        this.caseType = caseType;
        this.colour = colour;
    }

    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
