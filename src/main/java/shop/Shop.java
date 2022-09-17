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

    public int getStockQuantity(){
        return this.stock.size();
    }

    public double calcTotPotentialProfit(){
        double profit = 0.00;
        for (ISell item : this.stock) {
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
