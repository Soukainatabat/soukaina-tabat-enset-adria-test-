package com.example.Customerservice.Web;

import com.example.Customerservice.Entities.Wallet;
import com.example.Customerservice.Repositories.Walletrepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WalletController {
    private Walletrepository walletrepository;

    public WalletController(Walletrepository walletrepository) {
        this.walletrepository = walletrepository;
    }
    @GetMapping("/walletAll")
    public List<Wallet> walletList(){
        return walletrepository.findAll();
    }

}
