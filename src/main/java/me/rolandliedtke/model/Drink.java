package me.rolandliedtke.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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