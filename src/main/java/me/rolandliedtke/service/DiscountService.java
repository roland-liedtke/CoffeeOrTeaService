package me.rolandliedtke;

import org.example.Interface.ReduceInterface;
import org.example.Model.Beverage;

public class DiscountService implements ReduceInterface {
    
    public void applyDiscount(Beverage beverage, String discountCode) {
        if (beverage.getType().equalsIgnoreCase("Tea") && discountCode.equals("TEA10")) {
            double a = 0.90 * beverage.getPrice();
            beverage.setPrice(a);
        }
    }
}
