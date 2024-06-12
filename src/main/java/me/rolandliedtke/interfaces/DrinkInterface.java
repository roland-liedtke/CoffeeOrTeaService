package me.rolandliedtke.interfaces;

import me.rolandliedtke.model.DrinkAdditions;
import me.rolandliedtke.model.DrinkSize;

import java.util.List;

public interface DrinkInterface {

    // Interfejs
    String order();

    void chooseSize(DrinkSize drinkSize);

    void chooseAdditions(List<DrinkAdditions> drinkAdditions);

    void calculatePrice();
}
