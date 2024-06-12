package me.rolandliedtke.model.drink;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.rolandliedtke.interfaces.drink.DrinkAdditions;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Drink {

    private DrinkType drinkType;
    private DrinkSize drinkSize;
    private double price;
    private List<DrinkAdditions> drinkAdditions;
}