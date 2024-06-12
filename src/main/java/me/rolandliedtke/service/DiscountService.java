package me.rolandliedtke.service;


import me.rolandliedtke.interfaces.ReduceInterface;
import me.rolandliedtke.model.DiscountCode;
import me.rolandliedtke.model.Drink;
import me.rolandliedtke.model.DrinkType;

public class DiscountService implements ReduceInterface {
    
    public void applyDiscount(Drink drink, DiscountCode discountCode) {
        if (drink.getDrinkType().equals(DrinkType.TEA)) {
            double totalPrice = drink.getPrice() - (drink.getPrice() * discountCode.value);
            drink.setPrice(totalPrice);
        }
    }
}
