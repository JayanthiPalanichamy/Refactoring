# Clean Code

 A code smell is a surface indication that usually corresponds to a deeper problem in the system. 
 The term was first coined by Kent Beck.
 
 #### Refactoring:
 Refactoring is a disciplined technique for restructuring an existing body of code, altering its internal structure without changing its external behavior. 
 Its heart is a series of small behavior preserving transformations. Each transformation (called a "refactoring") does little, but a sequence of these
 transformations can produce a significant restructuring. Since each refactoring is small, it's less likely to go wrong. The system is kept fully working after 
 each refactoring, reducing the chances that a system can get seriously broken during the restructuring.

### Problem Statement 1:
 
 For given customer with Rentals
 Get a statement in html with customer name and total in bold
 
 - We see that the code is messy. Everything is tightly coupled to one method and it has multiple responsibility. 
 
 - Step 1 :  To make sure we are not affecting the existing code, we want to add tests.
      I added characteristic test in `CustomerTest` file. As opposed to unit tests, characteristics test are
      used for legacy system where you don't understand every single business logic. Characteristics test helps
      us to refactor without affecting the overall functionality of the code base.
     
      `Test -> Refactor -> Test`  If the test fails after refactoring, Never fix the test. 
      Revert back to when test was passing and start refactoring again. Its better to run test
      after every small change to identify which step broke the test.
 
 - Step 2: Rename variables in Customer class. `Each` in for loop is renamed to rental.
 - Step 3: `statement` function is doing too many things. It is calculating amount for movie, total amount, frequentRentersPoint and totalRenterPoints.
       The idea is start extracting functions from statement method that has single responsibility.
       Move amount for Rental into a new method.
 - Step 4: `amountFor` method is performing operations on fields of Rental class. This code smell is called Feature envy.
     - Feature Envy: Feature envy is a term used to describe a situation in which one object gets at the fields of another object in order to perform some sort of computation or make a decision, rather than asking the object to do the computation itself. 
     - To remove Feature envy, we are moving the method to rental class. One of the tests to check for feature
     envy is change the function to static and run the tests. If its passes, it should be moved to 
     appropriate class. Note: Feature envy can be present even if static test fails.
 - Step 5: Similarly extract frequentRenterPoints and move it rental to remove feature envy.
 - Step 6: Remove Inline variable and declaration in `frequentRenterPointsFor` method.
 - Step 7: Extract totalAmount and totalFrequentRenterPoints and Remove inline variables.
 - Step 8: Now all the values are decoupled, we can add htmlStatement functionality. Now the functionality is done. Should we stop refactoring,
 it looks like there is still a lot of improvement in code.
 - Step 9: We don't really `String.valueOf`, java interpolates strings on its own. Remove unnecessary methods.
 - Step 10: We know that customer is not responsible for generating statements. So Lets extract classes which does it.
 Lets create inner class out of the functionality. To decouple inner class from outer class, copy the methods and extract out arguments and move the class outside.
 Remove unused methods( totalAmount and totalFrequentRentersPoints) from Customer class. 
 - Step 11: We see that now html statement and text statement both calculating total amount and total frequent renter points. Its not responsibility of statement  
 to calculate this. We can extract out List of rentals as an object. We can see there are other refactorings possible, but for the given problem statement, we fixed most of the code we touched.
 Its important to know when to stop refactoring. Otherwise you will end up spending your entire time refactoring instead of working on new features.
 
 ### Problem Statement 1:
   We want to support new type of movie (YA_MOVIE),
   the rental cost of YA Movie/ per day is 4.0
   
 - Step 1: We see that Rental class can be refactored before adding new feature. So we start refactoring the rental class. getAmount method works on the 
 fields of movie class. This is feature envy, we can move the amount calculation to movie class. Do the similar thing for frequentRenter points.
 - Step 2: Amount calculation is still performed at movie class, it does calculation based on price code. This is
 great place to introduce sub class behaviours based on price code.
 - Step 3: we see we introduced a new bug, when no proper code is given, we got amount as null, now we get null.
 To remove this error, we introduce a default object for incorrect error code.
 - Step 4: Now we can add new feature of YA_MOVIE
 - Step 5: Remove magic numbers from price code sub classes. 
   

  
