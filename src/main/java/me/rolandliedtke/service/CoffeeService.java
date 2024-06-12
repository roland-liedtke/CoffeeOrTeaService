package me.rolandliedtke;

import org.example.Interface.DrinkInterface;
import org.example.Model.Beverage;

import java.util.ArrayList;
import java.util.List;

public class CoffeeService implements DrinkInterface {
    private List<String> additions;
    private Beverage beverage;

    public CoffeeService(Beverage beverage) {
        this.beverage = beverage;
        this.additions = new ArrayList<>();
    }

    @Override
    public String order() {
        return "Order placed for a " + beverage.getSize() + " " + beverage.getType() + " with additions: " + additions;
    }

    @Override
    public void chooseSize(String size) {
        this.beverage.setSize(size);
    }

    @Override
    public void chooseAdditions(List<String> additions) {
        this.additions = additions;
        this.additions.forEach(this.beverage::addAddition);
    }

    @Override
    public void calculatePrice() {
        double basePrice = 10;
        if (beverage.getSize().equals("L")) {
            basePrice += 2;
        } else if (beverage.getSize().equals("S")) {
            basePrice -= 1;
        }
        for (String addition : this.additions) {
            if (addition.equals("milk")) {
                basePrice += 2;
            } 
            if ( addition.equals("oat milk")) {
                basePrice += 2;
            } 
            if (addition.equals("sugar")) {
                basePrice += 1;
            } 
            if (addition.equals("cinnamon")) {
                basePrice += 1;
            }
        }
        beverage.setPrice(basePrice);
    }
}
