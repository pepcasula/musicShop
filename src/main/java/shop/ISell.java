package shop;

public interface ISell {

    double calculateMarkup();

    double getPrice();

    void setPrice(double price);

    double getWholesalePrice();

    void setWholesalePrice(double wholesalePrice);

    int getDeliveryFactor();

    int getInsuranceFactor();

    int getSetupFactor();
}
