package me.rolandliedtke.interfaces.drink;

import me.rolandliedtke.model.drink.Drink;
import me.rolandliedtke.model.drink.DrinkSize;
import me.rolandliedtke.model.drink.DrinkType;

import java.util.List;
import java.util.Scanner;

/**
 * The DrinkInterface provides methods for ordering a drink, choosing its size and additions,
 * and calculating its price.
 */
public interface DrinkInterface{

    /**
     * Places an order for a drink.
     * <p>
     * This method allows the user to choose the size and additions for the drink,
     * calculates the total price, and creates a Drink object representing the order.
     * </p>
     *
     * @return a string describing the placed order
     */
    default String order() {

        DrinkSize drinkSize = chooseSize();
        List<DrinkAdditions> drinkAdditions = chooseAdditions();
        Double totalPrice = calculatePrice(drinkSize, drinkAdditions);
        Drink drink = new Drink(DrinkType.COFFEE, drinkSize, totalPrice, drinkAdditions);

        return "Order placed for a " + drink.getDrinkSize() + " " + drink.getDrinkType() + " with additions: " + drinkAdditions;
    }

    /**
     * Prompts the user to choose the size of the drink.
     * <p>
     * The user is asked to input a size (S, M, L). If the input is invalid or not recognized,
     * the default size is set to M.
     * </p>
     *
     * @return the chosen drink size
     */
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

    /**
     * Prompts the user to choose additions for the drink.
     * <p>
     * Implementations of this method should define how the additions are chosen
     * and return a list of selected DrinkAdditions.
     * </p>
     *
     * @return a list of chosen drink additions
     */
    List<DrinkAdditions> chooseAdditions();

    /**
     * Calculates the total price of the drink based on its size and additions.
     *
     * @param drinkSize the size of the drink
     * @param drinkAdditions the list of additions for the drink
     * @return the total price of the drink
     */
    Double calculatePrice(DrinkSize drinkSize, List<DrinkAdditions> drinkAdditions);
}
