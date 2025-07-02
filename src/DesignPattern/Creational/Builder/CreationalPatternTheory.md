# Builder Pattern

## Theory

The Builder Pattern is a creational design pattern that allows for the step-by-step construction of complex objects. It separates the construction of an object from its representation, enabling the same construction process to create different representations. This pattern is especially useful when an object can have many optional parameters or when the construction process involves several steps.

### Structure
- **Builder**: Specifies an abstract interface for creating parts of a Product object.
- **ConcreteBuilder**: Provides an implementation for the Builder interface and keeps track of the representation it creates.
- **Product**: Represents the complex object under construction.
- **Director (optional)**: Constructs an object using the Builder interface.

### Benefits
- Handles the construction of objects with many optional or mandatory parameters.
- Improves code readability and maintainability by avoiding telescoping constructors.
- Allows for the construction of different representations of an object using the same building process.

### When to Use
- When an object needs to be created with many possible configuration options.
- When the construction process should be independent of the parts that make up the object and how they are assembled.
- When you want to ensure immutability of the constructed object.

---

The Builder Pattern is commonly used in frameworks and libraries for constructing complex objects, such as StringBuilder in Java or builders for HTTP requests.
