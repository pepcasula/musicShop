package accessories;

public class Case extends Accessory {

    CaseType caseType;

    public Case(
            String description,
            String brand,
            double wholesalePrice,
            double price,
            CaseType caseType
    ) {
        super(description, brand, wholesalePrice, price);
        this.caseType = caseType;
    }

    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
    }
}
