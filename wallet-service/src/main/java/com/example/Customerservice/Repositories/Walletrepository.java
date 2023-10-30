package com.example.Customerservice.Repositories;


import com.example.Customerservice.Entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Walletrepository extends JpaRepository<Wallet,Long> {
}
