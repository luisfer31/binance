package com.example.binance.bitcoin.model.entity;

import org.springframework.context.annotation.Configuration;

public class DataPass {
    public Double priceEntry;
    public Double gain;
    public Double lose;

    public DataPass() {
    }

    public DataPass(Double priceEntry, Double gain, Double lose) {
        this.priceEntry = priceEntry;
        this.gain = gain;
        this.lose = lose;
    }

    public Double getPriceEntry() {
        return priceEntry;
    }

    public void setPriceEntry(Double priceEntry) {
        this.priceEntry = priceEntry;
    }

    public Double getGain() {
        return gain;
    }

    public void setGain(Double gain) {
        this.gain = gain;
    }

    public Double getLose() {
        return lose;
    }

    public void setLose(Double lose) {
        this.lose = lose;
    }
}

