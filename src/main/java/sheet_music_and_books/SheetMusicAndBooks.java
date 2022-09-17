package sheet_music_and_books;

import shop.ISell;

public abstract class SheetMusicAndBooks implements ISell {

    private String title;
    private String publisher;
    private int pages;
    private double wholesalePrice;
    private double price;

    public SheetMusicAndBooks(String title, String publisher, int pages, double wholesalePrice, double price){
        this.title = title;
        this.publisher = publisher;
        this.pages = pages;
        this.wholesalePrice = wholesalePrice;
        this.price = price;
    }

    public double calculateMarkup(){
        return this.price - this.wholesalePrice;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
