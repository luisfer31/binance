package com.example.binance.bitcoin.controller;

import com.example.binance.bitcoin.model.BitCoin;
import com.example.binance.bitcoin.service.BitCoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "binance/bitcoin")
public class BitCoinController {
    private final BitCoinService bitCoinService;

    @Autowired
    public BitCoinController(BitCoinService bitCoinService) {
        this.bitCoinService = bitCoinService;
    }

    @GetMapping("/data_history")
    public List<BitCoin> getDataHistory() {
        return bitCoinService.getDataHistory();
    }

    @PostMapping("/data_entry")
    public void addData(
            @RequestParam(required = true) Double priceMarket,
            @RequestParam(required = true) Double invest) {
        bitCoinService.addData(priceMarket, invest);
    }

}
