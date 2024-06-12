package me.rolandliedtke.service;

import me.rolandliedtke.interfaces.drink.DrinkAdditions;
import me.rolandliedtke.interfaces.drink.DrinkInterface;
import me.rolandliedtke.model.coffee.CoffeeAdditions;
import me.rolandliedtke.model.drink.DrinkSize;

import java.util.*;

public class CoffeeService implements DrinkInterface {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public List<DrinkAdditions> chooseAdditions() {
        List<DrinkAdditions> coffeeAdditions = new ArrayList<>();

        // Zaimplementuj dodawanie dodatków
        coffeeAdditions.add(CoffeeAdditions.MILK);
        return coffeeAdditions;
    }

    @Override
    public Double calculatePrice(DrinkSize drinkSize, List<DrinkAdditions> drinkAdditions) {
        double additionsPrice = drinkAdditions.stream()
                .map(DrinkAdditions::getValue)
                .mapToDouble(v -> v)
                .sum();

        return drinkSize.value + additionsPrice;
    }
}
