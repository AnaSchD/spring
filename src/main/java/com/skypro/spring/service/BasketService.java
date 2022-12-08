package com.skypro.spring.service;


import com.skypro.spring.repository.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {

private final Basket basket;

    public BasketService(Basket basketRepository) {
        this.basket = basketRepository;
    }

    public void addToBasket(List<Integer> id) {
        this.basket.addToBasket(id);
    }

    public List<Integer> getBasket() {
        return this.basket.getBasket();
    }
}
