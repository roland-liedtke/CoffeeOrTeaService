package me.rolandliedtke.model.drink;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The DrinkSize enum represents various prices for a drink, each with an associated price.
 * <p>
 * Each size has a specific price that typically represents the price for that size.
 * </p>
 */
@AllArgsConstructor
@Getter
public enum DrinkSize {

    S(5.0), M(10.0), L(15.0);

    public final Double price;
}
