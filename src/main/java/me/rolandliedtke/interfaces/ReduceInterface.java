package me.rolandliedtke.service;

import me.rolandliedtke.model.Drink;

public interface ReduceInterface {
    void applyDiscount(Drink drink, String discountCode);
}
