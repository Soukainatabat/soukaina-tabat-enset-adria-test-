package com.example.Customerservice.Web;

import com.example.Customerservice.Repositories.Walletrepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {
    private Walletrepository walletrepository;

    public WalletController(Walletrepository walletrepository) {
        this.walletrepository = walletrepository;
    }

}
