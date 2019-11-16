package com.movierental;

import java.util.List;

class TextStatement {
  public String statement(String name, List<Rental> rentals) {
    String result = "Rental Record for " + name + "\n";
    for (Rental rental : rentals) {
      result += "\t" + rental.getMovie().getTitle() + "\t" +
              rental.amountFor() + "\n";
    }
    result += "Amount owed is " + totalAmount(rentals) + "\n";
    result += "You earned " + totalFrequentRenterPoints(rentals)
        + " frequent renter points";
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
