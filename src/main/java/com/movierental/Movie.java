package com.movierental;

public class Movie {
  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;

  private String title;
  private PriceCode priceCode;

  public Movie(String title, int priceCode) {
    this.title = title;
    setPriceCode(priceCode);
  }

  public int getPriceCode() {
    return priceCode.value();
  }

  public void setPriceCode(int priceCode) {
    switch (priceCode) {
      case REGULAR:
        this.priceCode = new RegularPriceCode();
        break;
      case NEW_RELEASE:
        this.priceCode = new NewReleasePriceCode();
        break;
      case CHILDRENS:
        this.priceCode = new ChildrenPriceCode();
        break;
    }

  }

  public String getTitle() {
    return title;
  }

  double amountFor(int daysRented) {

    return priceCode.amount(daysRented);
  }

  int frequentRenterPointsFor(int daysRented) {
   return priceCode.frequentRenterPoints(daysRented);
  }
}