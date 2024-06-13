package me.rolandliedtke.model.discount;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The DiscountCode enum represents various discount codes that can be applied to a tea order.
 * <p>
 * Each discount code has a value that typically represents the percentage discount it provides.
 * </p>
 */
@AllArgsConstructor
@Getter
public enum DiscountCode {

    /**
     * Represents no discount.
     * This code has a value of 0.0.
     */
    EMPTY(0.0),

    /**
     * Represents a 10% discount.
     * This code has a value of 0.1.
     */
    TEA10(0.1),

    /**
     * Represents a 20% discount.
     * This code has a value of 0.2.
     */
    TEA20(0.2),

    /**
     * Represents a 30% discount.
     * This code has a value of 0.3.
     */
    TEA30(0.3);

    public final double value;
}
