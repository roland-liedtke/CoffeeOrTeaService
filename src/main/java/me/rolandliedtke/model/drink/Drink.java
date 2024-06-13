package me.rolandliedtke.model.drink;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.rolandliedtke.interfaces.drink.DrinkAdditions;

import java.util.List;

/**
 * The Drink class represents a drink with various properties such as type, size, price, and additions.
 * <p>
 * This class is used to model a drink in the context of a beverage ordering system.
 * </p>
 */
@Getter
@Setter
@AllArgsConstructor
public class Drink {

    /**
     * The type of the drink.
     * <p>
     * Represents the type of drink, e.g., coffee, tea.
     * </p>
     */
    private DrinkType drinkType;

    /**
     * The size of the drink.
     * <p>
     * Represents the size of the drink, e.g., S, M, L.
     * </p>
     */
    private DrinkSize drinkSize;

    /**
     * The price of the drink.
     * <p>
     * Represents the total price of the drink including any additions.
     * </p>
     */
    private double price;

    /**
     * The additions to the drink.
     * <p>
     * Represents a list of additions (e.g., milk, sugar) that are included in the drink.
     * </p>
     */
    private List<DrinkAdditions> drinkAdditions;
}