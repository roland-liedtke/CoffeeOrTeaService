package me.rolandliedtke.service;

import me.rolandliedtke.interfaces.DrinkInterface;
import me.rolandliedtke.model.Drink;
import me.rolandliedtke.model.DrinkAdditions;
import me.rolandliedtke.model.DrinkSize;

import java.util.ArrayList;
import java.util.List;

public class CoffeeService implements DrinkInterface {
    private List<DrinkAdditions> drinkAdditions;
    private Drink drink;

    public CoffeeService(Drink drink) {
        this.drink = drink;
        this.drinkAdditions = new ArrayList<>();
    }

    @Override
    public String order() {
        return "Order placed for a " + drink.getDrinkSize() + " " + drink.getDrinkType() + " with additions: " + drinkAdditions;
    }

    @Override
    public void chooseSize(DrinkSize drinkSize) {
        this.drink.setDrinkSize(drinkSize);
    }

    @Override
    public void chooseAdditions(List<DrinkAdditions> drinkAdditions) {
        this.drinkAdditions = drinkAdditions;
        this.drinkAdditions.forEach(drinkAddition -> drink.getAdditions().add(drinkAddition));
    }

    @Override
    public void calculatePrice() {
        double basePrice = 10;
        if (drink.getDrinkSize().equals(DrinkSize.M)) {
            basePrice += 2;
        } else if (drink.getDrinkSize().equals(DrinkSize.S)) {
            basePrice -= 1;
        }
        for (DrinkAdditions addition : this.drinkAdditions) {
            if (addition.equals(DrinkAdditions.milk)) {
                basePrice += 2;
            } 

            if (addition.equals(DrinkAdditions.sugar)) {
                basePrice += 1;
            } 
            if (addition.equals(DrinkAdditions.honey)) {
                basePrice += 1;
            }
        }
        drink.setPrice(basePrice);
    }
}
