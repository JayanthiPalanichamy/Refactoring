package com.movierental;

public class UnknownPriceCodeType extends PriceCode {
    private int priceCode;

    public UnknownPriceCodeType( int priceCode ) {
        this.priceCode = priceCode;
    }

    @Override
    int value() {
        return priceCode;
    }

    @Override
    double amount(int daysRented) {
        return 0;
    }

    @Override
    public int frequentRenterPoints( int daysRented ) {
        return 0;
    }
}
