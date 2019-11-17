package com.movierental;

class HtmlStatement {

  public String statement(String name, Rentals rentals) {
    String result = "<h1>Rental Record for <b>" + name+ "</b></h1>";
    for (Rental rental : rentals) {
      result += "<p>" + rental.getMovie().getTitle() + " " +
              rental.amountFor() + "</p>";
    }
    result += "<p>Amount owed is <b>" + rentals.totalAmount() + "</b></p>";
    result += "<p>You earned " + rentals.totalFrequentRenterPoints()
            + " frequent renter points</p>";
    return result;
  }
}
