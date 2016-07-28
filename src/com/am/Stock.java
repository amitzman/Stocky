package com.am;

/**
 * Created by localadmin on 7/28/16.
 */
public class Stock {
    private String stockSymbol;
    private float price;
    private int sharesOwned;

    public Stock(String stockSymbol, float price, int sharesOwned) {
        this.stockSymbol = stockSymbol;
        this.price = price;
        this.sharesOwned = sharesOwned;
    }

    @Override
    public String toString() {
        return this.stockSymbol + " shares " + this.sharesOwned + " total " + (this.sharesOwned * this.price);
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSharesOwned() {
        return sharesOwned;
    }

    public void setSharesOwned(int sharesOwned) {
        this.sharesOwned = sharesOwned;
    }
}
