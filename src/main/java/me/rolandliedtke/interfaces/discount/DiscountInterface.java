package me.rolandliedtke.interfaces.discount;

import me.rolandliedtke.model.discount.DiscountCode;
import me.rolandliedtke.model.drink.Drink;

public interface DiscountInterface {

    // Interfejs obsługujący zniżkę po wpisaniu kodu
    void applyDiscount(Drink drink, DiscountCode discountCode);
}
