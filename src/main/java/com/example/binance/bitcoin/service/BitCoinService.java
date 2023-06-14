package com.example.binance.bitcoin.service;

import com.example.binance.bitcoin.model.BitCoin;
import com.example.binance.bitcoin.repository.BitcoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BitCoinService {
    private final BitcoinRepository bitcoinRepository;

    @Autowired
    public BitCoinService(BitcoinRepository bitcoinRepository){
        this.bitcoinRepository=bitcoinRepository;
    }

    public List<BitCoin>getDataHistory(){
        return bitcoinRepository.findAll();
    }

    public void addData(Double priceMarket, Double invest){
        BitCoin bitCoin = new BitCoin();
        bitCoin.setPriceMarket(priceMarket);
        bitCoin.setInvest(invest);
        bitcoinRepository.save(bitCoin);
    }




}
