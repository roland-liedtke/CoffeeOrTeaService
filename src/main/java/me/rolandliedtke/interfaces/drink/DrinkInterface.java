package me.rolandliedtke.interfaces.drink;

import me.rolandliedtke.model.drink.Drink;
import me.rolandliedtke.model.drink.DrinkSize;
import me.rolandliedtke.model.drink.DrinkType;

import java.util.List;
import java.util.Scanner;

public interface DrinkInterface{

    default String order() {

        DrinkSize drinkSize = chooseSize();
        List<DrinkAdditions> drinkAdditions = chooseAdditions();
        Double totalPrice = calculatePrice(drinkSize, drinkAdditions);
        Drink drink = new Drink(DrinkType.COFFEE, drinkSize, totalPrice, drinkAdditions);

        return "Order placed for a " + drink.getDrinkSize() + " " + drink.getDrinkType() + " with additions: " + drinkAdditions;
    }

    default DrinkSize chooseSize() {

        System.out.println("Choose a size (S, M, L):");

        DrinkSize drinkSize = switch (new Scanner(System.in).nextLine()) {
            case "S" -> DrinkSize.S;
            case "L" -> DrinkSize.L;
            default -> DrinkSize.M;
        };
        System.out.println("Your choice: " + drinkSize);
        return drinkSize;
    };

    List<DrinkAdditions> chooseAdditions();

    Double calculatePrice(DrinkSize drinkSize, List<DrinkAdditions> drinkAdditions);
}
