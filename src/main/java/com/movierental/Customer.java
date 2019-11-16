package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private String name;
  private List<Rental> rentals = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    String result = "Rental Record for " + getName() + "\n";
    for (Rental rental : rentals) {
      result += "\t" + rental.getMovie().getTitle() + "\t" +
          String.valueOf(rental.amountFor()) + "\n";
    }
    result += "Amount owed is " + String.valueOf(totalAmount()) + "\n";
    result += "You earned " + String.valueOf(totalFrequentRenterPoints())
        + " frequent renter points";
    return result;
  }

  double totalAmount() {
    double totalAmount = 0;
    for (Rental rental : rentals) {
      totalAmount +=  rental.amountFor();
    }
    return totalAmount;
  }

  int totalFrequentRenterPoints() {
    int totalFrequentRenterPoints =0;
    for (Rental rental : rentals) {
      totalFrequentRenterPoints += rental.frequentRenterPointsFor();

    }
    return totalFrequentRenterPoints;
  }

}

