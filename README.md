GoF Design Patterns
===================

**Simple implementations of GoF Design Patterns.**

Motivation of the current repository is to collect the implementations of 
the patterns presented in the *Head First Design Patterns* books.

The language is used: *Java*

List of GoF patterns by types
-----------------------------

### Creational

*Creational patterns are ones that create objects for you, instead of having you instantiate objects directly. 
This gives your program more flexibility in deciding which objects need to be created for a given case.*

- [x] **Abstract Factory** groups object factories that have a common theme.
- [x] **Factory Method** creates objects without specifying the exact class and class creator.
- [x] **Singleton** restricts object creation for a class to only one instance.

### Structural

They use inheritance to compose interfaces and define ways to compose objects to obtain new functionality.*

- [x] **Adapter** allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class.
- [x] **Composite** composes zero-or-more similar objects so that they can be manipulated as one object.
- [x] **Decorator** dynamically adds/overrides behaviour in an existing method of an object.
- [x] **Facade** provides a simplified interface to a large body of code.
- [x] **Proxy** provides a placeholder for another object to control access, reduce cost, and reduce complexity.

### Behavioral

*Most of these design patterns are specifically concerned with communication between objects.*

- [x] **Command** creates objects which encapsulate actions and parameters.
- [x] **Iterator** accesses the elements of an object sequentially without exposing its underlying representation.
- [x] **Observer** is a publish/subscribe pattern which allows a number of observer objects to see an event.
- [x] **State** allows an object to alter its behavior when its internal state changes.
- [x] **Strategy** allows one of a family of algorithms to be selected on-the-fly at runtime.
- [x] **Template Method** defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior.

