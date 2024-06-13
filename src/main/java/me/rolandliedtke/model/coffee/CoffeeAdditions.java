package me.rolandliedtke.model.coffee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.rolandliedtke.interfaces.drink.DrinkAdditions;

/**
 * The CoffeeAdditions enum represents various additions that can be added to a coffee drink.
 * <p>
 * Each addition has an index and a value, where the value typically represents the cost of the addition.
 * </p>
 */
@AllArgsConstructor
@Getter
public enum CoffeeAdditions implements DrinkAdditions {
    MILK(1, 2.0), SUGAR(2, 1.0), CINNAMON(3, 2.0), COFFEE_CREAM(4, 2.0);

    public final double index;
    public final double value;

    @Override
    public Double getValue() {
        return value;
    }
}
