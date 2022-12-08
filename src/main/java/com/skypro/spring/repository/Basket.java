package com.skypro.spring.repository;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Integer> idList = new ArrayList<>();

    public void addToBasket (List <Integer> id) {
        this.idList.addAll(id);
    }

    public List<Integer> getBasket() {
        return idList;
    }

}
