package me.rolandliedtke.model.drink;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DrinkSize {

    S(5.0), M(10.0), L(15.0);

    public final Double value;
}
