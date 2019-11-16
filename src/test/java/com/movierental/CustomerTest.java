package com.movierental;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;

    @Before
    public void setUp() {
       customer = new Customer("Jayanthi");

        Rental regularRental = new Rental(new Movie("RegularMovie", Movie.REGULAR), 4);
        Rental newReleaseRental = new Rental(new Movie("NewReleaseMovie", Movie.NEW_RELEASE), 2);
        Rental childrenRental = new Rental(new Movie("ChildrenMovie", Movie.CHILDRENS), 5);

        customer.addRental(regularRental);
        customer.addRental(newReleaseRental);
        customer.addRental(childrenRental);

    }
    @Test
    public void shouldGenerateStatementForGivenCustomer(){

        assertEquals( "Rental Record for Jayanthi\n" +
                "\tRegularMovie\t5.0\n" +
                "\tNewReleaseMovie\t6.0\n" +
                "\tChildrenMovie\t4.5\n" +
                "Amount owed is 15.5\n" +
                "You earned 4 frequent renter points", customer.statement());

    }

    @Test
    public void shouldGenerateHTMLStatementForGivenCustomer(){

        assertEquals( "<h1>Rental Record for <b>Jayanthi</b></h1><p>RegularMovie 5.0</p><p>NewReleaseMovie 6.0</p><p>ChildrenMovie 4.5</p><p>Amount owed is <b>15.5</b></p><p>You earned 4 frequent renter points</p>"
                , customer.htmlStatement());

    }

}