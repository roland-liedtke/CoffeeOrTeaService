package me.rolandliedtke.service;


import me.rolandliedtke.interfaces.discount.DiscountInterface;
import me.rolandliedtke.model.discount.DiscountCode;
import me.rolandliedtke.model.drink.Drink;
import me.rolandliedtke.model.drink.DrinkType;

public class DiscountService implements DiscountInterface {
    
    public void applyDiscount(Drink drink, DiscountCode discountCode) {
        if (drink.getDrinkType().equals(DrinkType.TEA)) {
            double totalPrice = drink.getPrice() - (drink.getPrice() * discountCode.value);
            drink.setPrice(totalPrice);
        }
    }
}
