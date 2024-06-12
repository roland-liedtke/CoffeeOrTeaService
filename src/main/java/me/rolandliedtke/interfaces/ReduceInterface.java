package me.rolandliedtke.interfaces;

import me.rolandliedtke.model.Drink;

public interface ReduceInterface {
    void applyDiscount(Drink drink, String discountCode);
}
