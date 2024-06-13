package me.rolandliedtke;

import me.rolandliedtke.interfaces.drink.DrinkInterface;
import me.rolandliedtke.model.drink.DrinkType;
import me.rolandliedtke.service.CoffeeService;
import me.rolandliedtke.service.TeaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DrinkInterface drinkInterface;

        System.out.println("Welcome to the Coffee Or Tea Shop!");

        // WYBRANY NAPÓJ
        System.out.println("Choose a drink type (Coffee/Tea):");
        DrinkType drinkType = switch (scanner.nextLine()) {
            case "Coffee", "COFFEE", "coffee" -> DrinkType.COFFEE;
            default -> DrinkType.TEA;
        };
        System.out.println("Your choice: " + drinkType);

        // Odpowiedni service zgodnie z wyborem napoju
        if (drinkType.equals(DrinkType.COFFEE)) {
            drinkInterface = new CoffeeService();
        } else {
            drinkInterface = new TeaService();
        }

        drinkInterface.order();
    }
}