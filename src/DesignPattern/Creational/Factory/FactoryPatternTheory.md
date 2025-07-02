# Factory Pattern

## Theory

The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. Instead of calling a constructor directly to create an object, a factory method is used. This pattern is useful when the exact type of the object to be created is determined at runtime.

### Structure
- **Product**: Defines the interface of objects the factory method creates.
- **ConcreteProduct**: Implements the Product interface.
- **Factory**: Contains a method for creating objects of type Product.
- **Client**: Uses the factory to get instances of Product.

### Benefits
- Promotes loose coupling by eliminating the need to bind application-specific classes into the code.
- The code deals only with the Product interface, not the concrete classes.

### Example Use Case
Suppose you want to create different types of notifications (Email, SMS, Push). The Factory Pattern allows you to create the appropriate notification object without specifying the exact class in the client code.

---

