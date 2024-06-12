package me.rolandliedtke.model;

public enum DrinkSize {
    S(5.0), M(10.0), L(15.0);

    public final double value;
    DrinkSize(double value) {
        this.value = value;
    }
}
