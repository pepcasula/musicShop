package shop;

import java.util.ArrayList;

public class Shop {

    private Stock stock;
    private Basket basket;

    public Shop() {
        this.stock = new Stock();
        this.basket = new Basket();
    }

    public void clearList(ArrayList<ISell> list) {
        list.clear();
    }

    public Stock getStock() {
        return stock;
    }

    public Basket getBasket() {
        return basket;
    }

}
