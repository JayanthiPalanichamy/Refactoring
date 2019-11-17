package com.movierental;

class TextStatement {

  public String statement(String name, Rentals rentals) {
    String result = "Rental Record for " + name + "\n";
    for (Rental rental : rentals) {
      result += "\t" + rental.getMovie().getTitle() + "\t" +
              rental.amountFor() + "\n";
    }
    result += "Amount owed is " + rentals.totalAmount() + "\n";
    result += "You earned " + rentals.totalFrequentRenterPoints()
        + " frequent renter points";
    return result;
  }
}
