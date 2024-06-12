package me.rolandliedtke.model.coffee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.rolandliedtke.interfaces.drink.DrinkAdditions;

@AllArgsConstructor
@Getter
public enum CoffeeAdditions implements DrinkAdditions {
    MILK(1, 2.0), SUGAR(2, 1.0);

    public final double index;
    public final double value;

    @Override
    public Double getValue() {
        return value;
    }
}
