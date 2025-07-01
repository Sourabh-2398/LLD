# Decorator Pattern - Theory

The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class. It is typically used to extend the functionalities of classes in a flexible and reusable way.

## Key Points
- **Composition over inheritance:** Decorators use composition to "wrap" objects, rather than creating subclasses for every possible combination of features.
- **Open/Closed Principle:** Classes are open for extension but closed for modification.
- **Dynamic behavior:** New functionality can be added at runtime.

## Structure
- **Component:** The interface or abstract class defining the operations.
- **ConcreteComponent:** The base implementation of the component.
- **Decorator:** An abstract class that implements the component interface and has a reference to a component object.
- **ConcreteDecorator:** Extends the decorator and adds new behavior.

## Example Use Cases
- Adding scrollbars to windows in a GUI toolkit
- Adding responsibilities to objects in a flexible way (e.g., logging, security, formatting)

## Advantages
- More flexible than static inheritance
- Avoids class explosion (no need for every combination as a subclass)
- Responsibilities can be added or removed at runtime

## Disadvantages
- Can result in many small objects
- Can be complex to debug due to many layers of wrapping

---

## References
- [GoF Design Patterns](https://en.wikipedia.org/wiki/Decorator_pattern)
- [Refactoring Guru - Decorator](https://refactoring.guru/design-patterns/decorator)
