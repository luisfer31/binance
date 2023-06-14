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
    private Double priceMarket;
    private Double priceEntry;
    private Double size;
    private Double invest;
    private LocalDate date;
    private LocalTime time;

    public BitCoin() {
    }

    public BitCoin(Long id, Double priceMarket, Double priceEntry, Double size, Double invest, LocalDate date, LocalTime time) {
        this.id = id;
        this.priceMarket = priceMarket;
        this.priceEntry = priceEntry;
        this.size = size;
        this.invest = invest;
        this.date = date;
        this.time = time;
    }

    public BitCoin(Double priceMarket, Double invest) {
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
                '}';
    }
}
