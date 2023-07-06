package com.example.binance.bitcoin.service;

import com.example.binance.bitcoin.config.BCRiskFactor;
import com.example.binance.bitcoin.config.InfoFormat;
import com.example.binance.bitcoin.model.BitCoin;
import com.example.binance.bitcoin.model.entity.DataPass;
import com.example.binance.bitcoin.repository.BitcoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class BitCoinService {
    ////////////////////////
    static String priMarket;
    static String priEntry;
    static String priGain;
    static String priLose;
    ///////////////////////
    DataPass dataPass = new DataPass();
    InfoFormat format = new InfoFormat();

    private final BitcoinRepository bitcoinRepository;

    @Autowired
    public BitCoinService(BitcoinRepository bitcoinRepository) {
        this.bitcoinRepository = bitcoinRepository;
    }


    public List<BitCoin> getDataHistory() {
        return bitcoinRepository.findAll();
    }

    public void addData(Character riskF, Double priceMarket, Double invest) {
        BitCoin bitCoin = new BitCoin();
        bitCoin.setRiskF(riskF);
        bitCoin.setPriceMarket(priceMarket);
        bitCoin.setPriceEntry(priceEntry(bitCoin).getPriceEntry());
        bitCoin.setGain(priceEntry(bitCoin).getGain());
        bitCoin.setLose(priceEntry(bitCoin).getLose());
        bitCoin.setInvest(invest);
        bitCoin.setSize(size(bitCoin));
        bitCoin.setDate(entryDate());
        bitCoin.setTime(entryTime());
        bitCoin.setInfo(investInfo(bitCoin));
        bitcoinRepository.save(bitCoin);
    }

    public DataPass priceEntry(BitCoin bitCoin) {
        Character opc = bitCoin.getRiskF();
        switch (opc) {
            case 'a':
                dataPass.priceEntry = bitCoin.getPriceMarket() + BCRiskFactor.W190.getWinFactor();
                dataPass.gain = dataPass.getPriceEntry() + BCRiskFactor.W190.getGain();
                dataPass.lose = dataPass.getPriceEntry() + BCRiskFactor.W190.getLose();
                break;

            case 'b':
                dataPass.priceEntry = bitCoin.getPriceMarket() + BCRiskFactor.W350.getWinFactor();
                dataPass.gain = dataPass.getPriceEntry() + BCRiskFactor.W350.getGain();
                dataPass.lose = dataPass.getPriceEntry() + BCRiskFactor.W350.getLose();
                break;

            case 'c':
                dataPass.priceEntry = bitCoin.getPriceMarket() + BCRiskFactor.W600.getWinFactor();
                dataPass.gain = dataPass.getPriceEntry() + BCRiskFactor.W600.getGain();
                dataPass.lose = dataPass.getPriceEntry() + BCRiskFactor.W600.getLose();
                break;

            case 'd':
                dataPass.priceEntry = bitCoin.getPriceMarket() + BCRiskFactor.W1000.getWinFactor();
                dataPass.gain = dataPass.getPriceEntry() + BCRiskFactor.W1000.getGain();
                dataPass.lose = dataPass.getPriceEntry() + BCRiskFactor.W1000.getLose();
                break;
        }
        return dataPass;
    }

    public double size(BitCoin bitCoin) {
        return bitCoin.getInvest() * 20;
    }

    public LocalDate entryDate() {
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    public LocalTime entryTime() {
        LocalTime localTime = LocalTime.now();
        return localTime;
    }

    public String investInfo(BitCoin bitCoin) {

        priMarket = String.valueOf(bitCoin.getPriceMarket());
        priEntry = String.valueOf(bitCoin.getPriceEntry());
        priGain = String.valueOf(bitCoin.getGain());
        priLose = String.valueOf(bitCoin.getLose());

//        String info = String.format(
//
//                "MARKET PRICE: %.2f    PRICE ENTRY: %.2f    TARGET PROFIT: %.2f    STOP LOSE: %.2f",
//                bitCoin.getPriceMarket(), bitCoin.getPriceEntry(), bitCoin.getGain(), bitCoin.getLose());
        var info= """
               MARKET PRICE: %.2f    
               PRICE ENTRY: %.2f    
               TARGET PROFIT: %.2f    
               STOP LOSE: %.2f
                """.formatted(bitCoin.getPriceMarket(), bitCoin.getPriceEntry(), bitCoin.getGain(), bitCoin.getLose());
        System.out.println(info);
        return info;

    }

    public String showStrategy(BitCoin bitCoin) {
//        double price = bitCoin.getPriceMarket();
//        String priceMarket = String.valueOf(bitCoin.getPriceMarket());
//        String priceEntry = String.valueOf(bitCoin.getPriceEntry());
//        String targetProfit = String.valueOf(bitCoin.getGain());
//        String stopLose = String.valueOf(bitCoin.getLose());

        String info =
                        "--------------------------------------------------------------\n" +
                        "PRICE MARKET: |\tPRICE ENTRY: |\tTARGET PROFIT: |\tSTOP LOSE:" + "\n"
                        + priMarket + "\t\t\t" + priEntry + "\t\t\t" + priGain + "\t\t\t\t" + priLose + "\n"
                        + "--------------------------------------------------------------";
        return info;
    }


}
