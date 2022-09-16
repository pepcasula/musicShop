package shop;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public void addItemsToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemsFromStock(ISell item){
        this.stock.remove(item);
    }

    public void clearStock(){
        this.stock.clear();
    }
}
