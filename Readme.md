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
  
