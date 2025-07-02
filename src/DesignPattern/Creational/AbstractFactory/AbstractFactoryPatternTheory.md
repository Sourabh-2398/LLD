# Abstract Factory Pattern

## Theory

The Abstract Factory Pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is useful when the system needs to be independent of how its objects are created, composed, and represented.

### Structure
- **AbstractFactory**: Declares a set of methods for creating abstract products.
- **ConcreteFactory**: Implements the creation methods for specific product families.
- **AbstractProduct**: Declares an interface for a type of product.
- **ConcreteProduct**: Implements the product interface for a specific variant.
- **Client**: Uses only interfaces declared by AbstractFactory and AbstractProduct.

### Example Use Case
Suppose you want to create a family of vehicles (Luxury and Classic), each with a Car and a Bike. The Abstract Factory pattern allows you to create these families without specifying the exact class of the object that will be created.

---

