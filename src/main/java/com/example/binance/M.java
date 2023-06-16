package com.example.binance;

import com.example.binance.bitcoin.model.BitCoin;

public class M {
    ////////////////////////
    static String priMarket;
    static String priEntry;
    static String priGain;
    static String priLose;
    ///////////////////////
    public static void main(String[] args) {

        System.out.println(showStrategy());
    }
    public static String showStrategy(){


        String info =
                "--------------------------------------------------------------\n" +
                        "PRICE MARKET: |\tPRICE ENTRY: |\tTARGET PROFIT: |\tSTOP LOSE:" + "\n"
                        + priMarket + "\t\t\t" + priEntry + "\t\t\t" + priGain + "\t\t\t" + priLose + "\n"
                + "--------------------------------------------------------------";
        return info;
    }
}
