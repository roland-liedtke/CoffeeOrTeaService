package me.rolandliedtke.interfaces;

import me.rolandliedtke.model.DiscountCode;
import me.rolandliedtke.model.Drink;

public interface ReduceInterface {

    // Interfejs obsługujący zniżkę po wpisaniu kodu
    void applyDiscount(Drink drink, DiscountCode discountCode);
}
