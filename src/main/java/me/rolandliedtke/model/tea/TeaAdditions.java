package me.rolandliedtke.model.tea;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.rolandliedtke.interfaces.drink.DrinkAdditions;

/**
 * The TeaAdditions enum represents various additions that can be added to tea.
 * <p>
 * Each addition has an index and a value, where the value typically represents the cost of the addition.
 * </p>
 */
@Getter
@AllArgsConstructor
public enum TeaAdditions implements DrinkAdditions {
    HONEY(1, 3.0), LEMON(2, 4.0), SUGAR(3, 2.0);

    public final double index;
    public final double price;

    @Override
    public Double getValue() {
        return price;
    }
}
