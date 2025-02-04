Explanation:
Interface (Vehicle):
Defines an abstract method start() that must be implemented by any class that implements this interface.
Abstract Class (Car):
Implements the Vehicle interface.
Defines an abstract method accelerate(), which must be implemented by a concrete subclass.
Contains a concrete method showBrand().
Concrete Class (Sedan):
Extends Car and provides implementations for both start() and accelerate().
Uses a constructor to initialize the brand.
Main Method (VehicleDemo):
Demonstrates the instantiation and method calls for a concrete class (Sedan).
