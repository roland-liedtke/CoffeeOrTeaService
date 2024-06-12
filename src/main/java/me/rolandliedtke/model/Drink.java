package me.rolandliedtke.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Drink {

    // Model Napoju, zawiera rodzaj, rozmiar, cenę i dodatki
    private DrinkType drinkType;
    private DrinkSize drinkSize;
    private double price;
    private List<DrinkAdditions> drinkAdditions;

    public Drink(DrinkType drinkType, DrinkSize drinkSize, double price) {
        this.drinkType = drinkType;
        this.drinkSize = drinkSize;
        this.price = price;
    }
}