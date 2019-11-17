package com.movierental;

public class YAPriceCode extends PriceCode {
    @Override
    int value() {
        return Movie.YA_MOVIE;
    }

    @Override
    int frequentRenterPoints(int daysRented) {
        return 1;
    }

    @Override
    double amount(int daysRented) {
        return 4.0 * daysRented;
    }
}
