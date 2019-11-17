package com.movierental;

public class ChildrenPriceCode extends PriceCode {
    @Override
    int value() {
        return 2;
    }

    @Override
    public double amount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;

        return amount;
    }

}
