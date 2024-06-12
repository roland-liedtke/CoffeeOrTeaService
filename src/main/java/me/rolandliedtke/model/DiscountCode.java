package me.rolandliedtke.model;

public enum DiscountCode {
    EMPTY(0.0), TEA10(0.1), TEA20(0.2), TEA30(0.3);

    public final double value;

    DiscountCode(double value) {
        this.value = value;
    }
}
