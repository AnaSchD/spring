package com.skypro.spring.service;

import com.skypro.spring.repository.ShoppingBasket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {

    private final ShoppingBasket shoppingBasket;

    public BasketService(ShoppingBasket shopBasket) {
        this.shoppingBasket = shopBasket;
    }

    public void addToBasket(List<Integer> id) {
        this.shoppingBasket.addToBasket(id);
    }

    public List<Integer> getBasket() {
       return this.shoppingBasket.getBasket();
    }
}
