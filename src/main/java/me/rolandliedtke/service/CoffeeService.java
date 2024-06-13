package me.rolandliedtke.service;

import me.rolandliedtke.interfaces.drink.DrinkAdditions;
import me.rolandliedtke.interfaces.drink.DrinkInterface;
import me.rolandliedtke.model.coffee.CoffeeAdditions;
import me.rolandliedtke.model.drink.DrinkSize;

import java.util.*;

public class CoffeeService implements DrinkInterface {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String getCoupon() {
        return "";
    }

    @Override
    public List<DrinkAdditions> chooseAdditions() {
        List<DrinkAdditions> coffeeAdditions = new ArrayList<>();

        System.out.println("Available additions: ");

        Arrays.stream(CoffeeAdditions.values()).forEach(System.out::println);

        switch (scanner.nextLine()) {
            case "MILK", "Milk", "milk" -> coffeeAdditions.add(CoffeeAdditions.MILK);
            case "SUGAR", "Sugar", "sugar" -> coffeeAdditions.add(CoffeeAdditions.SUGAR);
            case "CINNAMON", "Cinnamon", "cinnamon" -> coffeeAdditions.add(CoffeeAdditions.CINNAMON);
            case "COFFEE CREAM", "Coffee cream", "coffee cream" -> coffeeAdditions.add(CoffeeAdditions.COFFEE_CREAM);
            default -> {
            }
        }
        System.out.println("Your choice: " + coffeeAdditions);

        return coffeeAdditions;
    }

    @Override
    public Double calculatePrice(DrinkSize drinkSize, List<DrinkAdditions> drinkAdditions) {
        double additionsPrice = drinkAdditions.stream()
                .map(DrinkAdditions::getValue)
                .mapToDouble(v -> v)
                .sum();
        return drinkSize.price + additionsPrice;
    }
}
