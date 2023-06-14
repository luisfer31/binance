package com.example.binance.bitcoin.config;

public enum BitCoinRiskFactor {
    W190(80, -100, -190),
    W350(140, -180, -350),
    W600(300, -150, -600),
    W1000(450, -200, -1000);

    private final double gain;
    private final double lose;
    private final double winfactor;

    BitCoinRiskFactor(double gain, double lose, double winfactor) {
        this.gain = gain;
        this.lose = lose;
        this.winfactor = winfactor;
    }

    public double getGain() {
        return gain;
    }

    public double getLose() {
        return lose;
    }

    public double getWinfactor() {
        return winfactor;
    }
}
