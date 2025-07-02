# Factory Method Pattern

## Theory

The Factory Method Pattern is a creational design pattern that defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses. This pattern is useful when a class cannot anticipate the class of objects it must create.

### Structure
- **Product**: Defines the interface of objects the factory method creates.
- **ConcreteProduct**: Implements the Product interface.
- **Creator (Abstract Class or Interface)**: Declares the factory method, which returns an object of type Product. May also define a default implementation.
- **ConcreteCreator**: Overrides the factory method to return an instance of a ConcreteProduct.

### Benefits
- Promotes loose coupling by eliminating the need to bind application-specific classes into the code.
- The code deals only with the Product interface, not the concrete classes.
- Makes code more extensible and easier to introduce new products.

## Example: Document Creator
Suppose you are building a document editor that can create different types of documents (e.g., Word, PDF). The Factory Method pattern allows you to define a common interface for documents and let subclasses decide which document to create.

---
