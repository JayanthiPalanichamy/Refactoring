package com.movierental;

public class RegularPriceCode extends PriceCode {
    @Override
    int value() {
        return Movie.REGULAR;
    }

    @Override
    public double amount(int daysRented) {
        double amount = 2;
        if (daysRented > 2)
            amount += (daysRented- 2) * 1.5;
     return amount;
    }
}
