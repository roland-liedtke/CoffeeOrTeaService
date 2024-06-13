package me.rolandliedtke.interfaces.discount;

import me.rolandliedtke.model.discount.DiscountCode;
import me.rolandliedtke.model.drink.Drink;

/**
 * The DiscountInterface provides a method for applying a discount to a drink.
 * <p>
 * Implementations of this interface should define how the discount is applied
 * based on the given discount code.
 * </p>
 */
public interface DiscountInterface {

    /**
     * Applies a discount to the specified drink based on the given discount code.
     *
     * @param drink the drink to which the discount will be applied
     * @param discountCode the discount code that determines the discount to be applied
     */
    void applyDiscount(Drink drink, DiscountCode discountCode);
}
