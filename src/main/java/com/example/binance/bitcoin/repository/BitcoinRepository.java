package com.example.binance.bitcoin.repository;

import com.example.binance.bitcoin.model.BitCoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BitcoinRepository extends JpaRepository<BitCoin, Long>{
}
