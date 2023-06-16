package com.example.binance.bitcoin.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table
public class BitCoin {
    @Id
    @SequenceGenerator(
            name = "bitcoin_sequence",
            sequenceName = "bitcoin_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "bitcoin_sequence"
    )
    private Long id;

    private Character riskF;
    private Double priceMarket;
    private Double priceEntry;

    private Double gain;

    private Double lose;
    private Double invest;
    private Double size;
    private LocalDate date;
    private LocalTime time;
    private String info;

    public BitCoin() {
    }

    public BitCoin(Long id, Character riskF, Double priceMarket, Double priceEntry, Double gain, Double lose, Double invest, Double size, LocalDate date, LocalTime time, String info) {
        this.id = id;
        this.riskF = riskF;
        this.priceMarket = priceMarket;
        this.priceEntry = priceEntry;
        this.gain = gain;
        this.lose = lose;
        this.invest = invest;
        this.size = size;
        this.date = date;
        this.time = time;
        this.info = info;
    }

    public BitCoin(Character riskF, Double priceMarket, Double invest) {
        this.riskF = riskF;
        this.priceMarket = priceMarket;
        this.invest = invest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPriceMarket() {
        return priceMarket;
    }

    public void setPriceMarket(Double priceMarket) {
        this.priceMarket = priceMarket;
    }

    public Double getPriceEntry() {
        return priceEntry;
    }

    public void setPriceEntry(Double priceEntry) {
        this.priceEntry = priceEntry;
    }

    public Double getInvest() {
        return invest;
    }

    public void setInvest(Double invest) {
        this.invest = invest;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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

    public Character getRiskF() {
        return riskF;
    }

    public void setRiskF(Character riskF) {
        this.riskF = riskF;
    }

    @Override
    public String toString() {
        return "BitCoin{" +
                "id=" + id +
                ", priceMarket=" + priceMarket +
                ", priceEntry=" + priceEntry +
                ", size=" + size +
                ", invest=" + invest +
                ", date=" + date +
                ", time=" + time +
                ", info='" + info + '\'' +
                '}';
    }
}
