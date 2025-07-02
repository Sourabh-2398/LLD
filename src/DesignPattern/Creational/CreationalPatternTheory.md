# Creational Design Patterns

## Theory

Creational design patterns are a category of design patterns that deal with object creation mechanisms. They abstract the instantiation process, making it more flexible and dynamic. Instead of creating objects directly using constructors, creational patterns provide various ways to create objects, which can increase the flexibility and reuse of existing code.

### Types of Creational Patterns
- **Singleton**: Ensures a class has only one instance and provides a global point of access to it.
- **Factory Method**: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
- **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Builder**: Separates the construction of a complex object from its representation so that the same construction process can create different representations.
- **Prototype**: Creates new objects by copying an existing object, known as the prototype.

### Why Use Creational Patterns?
- To manage and control object creation.
- To decouple the client code from the concrete classes it needs to instantiate.
- To make the system independent of how its objects are created, composed, and represented.

---

Creational patterns help make systems more flexible, testable, and maintainable by abstracting the instantiation process and allowing for more controlled and consistent object creation.

