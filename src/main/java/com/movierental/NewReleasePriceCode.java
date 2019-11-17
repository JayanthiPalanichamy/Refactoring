package com.movierental;

public class NewReleasePriceCode extends PriceCode {

    @Override
    int value() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double amount(int daysRented) {
        return daysRented* 3;
    }

    @Override
    int frequentRenterPoints(int daysRented) {
        if(daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
