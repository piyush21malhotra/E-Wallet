package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    @Autowired
    WalletRepository walletRepository;

    public void createWallet(String userName) {
        Wallet wallet = Wallet.builder()
                .amount(0)
                .userName(userName)
                .build();
        walletRepository.save(wallet);
    }

    public Wallet incrementWallet(String userName, int amount) {
        Wallet wallet = walletRepository.findByUserName(userName);
        int updatedAmount = wallet.getAmount() + amount;
        wallet.setAmount(updatedAmount);
        walletRepository.save(wallet);
        return wallet;
    }

    public Wallet decrementWallet(String userName, int amount) {
        Wallet wallet = walletRepository.findByUserName(userName);
        int updatedAmount = wallet.getAmount() - amount;
        wallet.setAmount(updatedAmount);
        walletRepository.save(wallet);
        return wallet;
    }
}
