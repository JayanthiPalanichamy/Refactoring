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
 
 
 