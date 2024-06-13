package me.rolandliedtke.service;

import me.rolandliedtke.interfaces.drink.DrinkInterface;
import me.rolandliedtke.interfaces.drink.DrinkAdditions;
import me.rolandliedtke.model.coffee.CoffeeAdditions;
import me.rolandliedtke.model.drink.DrinkSize;
import me.rolandliedtke.model.tea.TeaAdditions;

import java.util.*;

public class TeaService implements DrinkInterface {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public List<DrinkAdditions> chooseAdditions() {
        List<DrinkAdditions> teaAdditions = new ArrayList<>();

        System.out.println("Available additions: ");

        // przenieś do prywatnej metody
        Arrays.stream(TeaAdditions.values()).forEach(System.out::println);

        switch (scanner.nextLine()) {
            case "HONEY", "Honey", "honey" -> teaAdditions.add(TeaAdditions.HONEY);
            case "LEMON", "Lemon", "lemon" -> teaAdditions.add(TeaAdditions.LEMON);
            default -> {
            }
        };
        System.out.println("Your choice: " + teaAdditions);

        return teaAdditions;
    }

    @Override
    public Double calculatePrice(DrinkSize drinkSize, List<DrinkAdditions> drinkAdditions) {
        double additionsPrice = drinkAdditions.stream()
                .map(DrinkAdditions::getValue)
                .mapToDouble(v -> v)
                .sum();
        double totalPrice = drinkSize.price + additionsPrice;
        System.out.println("Total price: " + totalPrice);

        return totalPrice;
    }
}
