package com.movierental;

public class Rental {

  private int daysRented;
  private Movie movie;

  public Rental(Movie movie, int daysRented){
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public int getDaysRented() {
    return daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

  double amountFor() {
    return movie.amountFor(daysRented);
  }

  double frequentRenterPointsFor() {
    return movie.frequentRenterPointsFor(daysRented);
  }

}