package me.rolandliedtke.model.tea;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.rolandliedtke.interfaces.drink.DrinkAdditions;

@Getter
@AllArgsConstructor
public enum TeaAdditions implements DrinkAdditions {
    HONEY(1, 3.0), LEMON(2, 4.0);

    public final double index;
    public final double value;

    @Override
    public Double getValue() {
        return value;
    }
}
