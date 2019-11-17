package com.movierental;

public abstract class PriceCode {
    abstract  int value();
    abstract double amount(int daysRented);

    int frequentRenterPoints(int daysRented) {
        return 1;
    }
}
