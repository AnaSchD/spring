package com.skypro.spring.controller;

import com.skypro.spring.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> idProducts) {
        this.basketService.addToBasket(idProducts);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return this.basketService.getBasket();
    }

}
