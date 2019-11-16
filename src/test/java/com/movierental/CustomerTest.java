package com.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void shouldGenerateStatementForGivenCustomer(){
        Customer customer = new Customer("Jayanthi");

        Rental regularRental = new Rental(new Movie("RegularMovie", Movie.REGULAR), 4);
        Rental newReleaseRental = new Rental(new Movie("NewReleaseMovie", Movie.NEW_RELEASE), 2);
        Rental childrenRental = new Rental(new Movie("ChildrenMovie", Movie.CHILDRENS), 5);

        customer.addRental(regularRental);
        customer.addRental(newReleaseRental);
        customer.addRental(childrenRental);

        assertEquals( "Rental Record for Jayanthi\n" +
                "\tRegularMovie\t5.0\n" +
                "\tNewReleaseMovie\t6.0\n" +
                "\tChildrenMovie\t4.5\n" +
                "Amount owed is 15.5\n" +
                "You earned 4 frequent renter points", customer.statement());

    }

}