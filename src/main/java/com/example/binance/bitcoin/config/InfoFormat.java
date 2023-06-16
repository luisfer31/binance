package com.example.binance.bitcoin.config;

public class InfoFormat {
    private String marketPrice;
    private String priceEntry;
    private String targetProfit;
    private String stopLose;

    public InfoFormat() {
    }

    public InfoFormat(String marketPrice, String priceEntry, String targetProfit, String stopLose) {
        this.marketPrice = marketPrice;
        this.priceEntry = priceEntry;
        this.targetProfit = targetProfit;
        this.stopLose = stopLose;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getPriceEntry() {
        return priceEntry;
    }

    public void setPriceEntry(String priceEntry) {
        this.priceEntry = priceEntry;
    }

    public String getTargetProfit() {
        return targetProfit;
    }

    public void setTargetProfit(String targetProfit) {
        this.targetProfit = targetProfit;
    }

    public String getStopLose() {
        return stopLose;
    }

    public void setStopLose(String stopLose) {
        this.stopLose = stopLose;
    }
}
