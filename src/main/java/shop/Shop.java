package shop;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private ArrayList<ISell> basket;

    public Shop(){
        this.stock = new ArrayList<>();
        this.basket = new ArrayList<>();
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

    public void addToBasket(ISell item){
        for (ISell available: this.stock){
            if (item == available){
                this.basket.add(item);
            }
        }
    }

    public void removeFromBasket(ISell item){
        if (this.basket.contains(item)){
            this.basket.remove(item);
        }
    }

    public void clearBasket(){
        if (this.basket.size() != 0){
            this.basket.clear();
        }
    }

    public int countBasketItems(){
        return this.basket.size();
    }

    public double checkout(){
        double basketAmount = 0.00;
        for (ISell item : this.basket){
            if (countBasketItems() != 0){
                basketAmount += item.getPrice();
            }
        }
        return basketAmount;
    }
}
