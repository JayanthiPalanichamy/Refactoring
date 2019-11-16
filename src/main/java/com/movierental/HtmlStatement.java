package com.movierental;

import java.util.List;

class HtmlStatement {
  public String statement(String name, List<Rental> rentals) {
    String result = "<h1>Rental Record for <b>" + name+ "</b></h1>";
    for (Rental rental : rentals) {
      result += "<p>" + rental.getMovie().getTitle() + " " +
              rental.amountFor() + "</p>";
    }
    result += "<p>Amount owed is <b>" + totalAmount(rentals) + "</b></p>";
    result += "<p>You earned " + totalFrequentRenterPoints(rentals)
            + " frequent renter points</p>";
    return result;
  }

  double totalAmount(List<Rental> rentals) {
    double totalAmount = 0;
    for (Rental rental : rentals) {
      totalAmount +=  rental.amountFor();
    }
    return totalAmount;
  }

  int totalFrequentRenterPoints(List<Rental> rentals) {
    int totalFrequentRenterPoints =0;
    for (Rental rental : rentals) {
      totalFrequentRenterPoints += rental.frequentRenterPointsFor();

    }
    return totalFrequentRenterPoints;
  }
}
