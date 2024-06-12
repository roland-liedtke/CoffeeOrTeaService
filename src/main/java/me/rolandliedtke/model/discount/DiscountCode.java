package me.rolandliedtke.model.discount;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DiscountCode {
    EMPTY(0.0), TEA10(0.1), TEA20(0.2), TEA30(0.3);

    public final double value;
}
