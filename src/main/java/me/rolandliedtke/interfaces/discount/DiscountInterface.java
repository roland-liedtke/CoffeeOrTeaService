package me.rolandliedtke.interfaces.discount;

/**
 * The DiscountInterface provides a method for applying a discount to a drink.
 * <p>
 * Implementations of this interface should define how the discount is applied
 * based on the given discount code.
 * </p>
 */
public interface DiscountInterface {

    /**
     * Applies a discount on the given discount code.
     *
     * @param discountCode the discount code that determines the discount to be applied
     * @return value of discount
     */
    Double applyDiscount(String discountCode);
}
