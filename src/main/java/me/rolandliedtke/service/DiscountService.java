package me.rolandliedtke.service;


import me.rolandliedtke.interfaces.ReduceInterface;
import me.rolandliedtke.model.Drink;
import me.rolandliedtke.model.DrinkType;

public class DiscountService implements ReduceInterface {
    
    public void applyDiscount(Drink drink, String discountCode) {
        if (drink.getDrinkType().equals(DrinkType.TEA) && discountCode.equals("TEA10")) {
            double a = 0.90 * drink.getPrice();
            drink.setPrice(a);
        }
    }
}
