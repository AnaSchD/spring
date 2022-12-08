package com.skypro.spring.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class ShoppingBasket {

    private final List<Integer> idProducts = new ArrayList<>();

    public void addToBasket(List<Integer> id) {
        this.idProducts.addAll(id);
    }

    public List<Integer> getBasket() {
        return this.idProducts;
    }


}
