package me.rolandliedtke.service;


import me.rolandliedtke.interfaces.DrinkInterface;
import me.rolandliedtke.model.Drink;
import me.rolandliedtke.model.DrinkAdditions;
import me.rolandliedtke.model.DrinkSize;

import java.util.ArrayList;
import java.util.List;

public class TeaService implements DrinkInterface {
    private List<DrinkAdditions> drinkAdditions;
    private Drink drink;

    public TeaService(Drink drink) {
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
        this.drinkAdditions.forEach(drinkAddition -> drink.getDrinkAdditions().add(drinkAddition));
    }

    @Override
    public void calculatePrice() {
        double basePrice = 7;
        if (drink.getDrinkSize().equals(DrinkSize.M)) {
            basePrice += 2;
        } else if (drink.getDrinkSize().equals(DrinkSize.S)) {
            basePrice -= 1;
        }
        for (DrinkAdditions addition : this.drinkAdditions) {
            if (addition.equals(DrinkAdditions.LEMON)) {
                basePrice += 2;
            } 
            if (addition.equals(DrinkAdditions.HONEY)) {
                basePrice += 1;
            } 
            if (addition.equals(DrinkAdditions.SUGAR)) {
                basePrice += 1;
            }
        }
        drink.setPrice(basePrice);
    }
}
