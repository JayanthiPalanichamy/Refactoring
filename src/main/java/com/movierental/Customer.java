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
              rental.amountFor() + "\n";
    }
    result += "Amount owed is " + totalAmount() + "\n";
    result += "You earned " + totalFrequentRenterPoints()
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

  public String htmlStatement() {
    String result = "<h1>Rental Record for <b>" + getName() + "</b></h1>";
    for (Rental rental : rentals) {
      result += "<p>" + rental.getMovie().getTitle() + " " +
              rental.amountFor() + "</p>";
    }
    result += "<p>Amount owed is <b>" + totalAmount() + "</b></p>";
    result += "<p>You earned " + totalFrequentRenterPoints()
            + " frequent renter points</p>";
    return result;
  }
}

