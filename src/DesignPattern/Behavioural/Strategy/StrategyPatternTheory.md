# Strategy Pattern Theory

## What is the Strategy Pattern?
The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. The context (main class) delegates the behavior to a strategy object instead of implementing it directly.

## Benefits
- Promotes code reusability and flexibility
- Makes code easier to extend and maintain
- Allows changing behavior at runtime

## Example: Vehicle System
- **Context:** Vehicle (base class)
- **Strategies:** MoveStrategy (interface), DriveStrategy, RideStrategy, PedalStrategy (implementations)
- **Concrete Contexts:** Car, Bike, Truck, Bus, Bicycle (child classes)

### UML Diagram
```
Vehicle
  |
  +-- Car
  +-- Bike
  +-- Truck
  +-- Bus
  +-- Bicycle

Vehicle has-a MoveStrategy
MoveStrategy <|-- DriveStrategy
MoveStrategy <|-- RideStrategy
MoveStrategy <|-- PedalStrategy
```

## How it works in code
- Each vehicle delegates its `move()` behavior to a `MoveStrategy`.
- You can change a vehicle's move strategy at runtime using `setMoveStrategy()`.
- This makes the system scalable for new vehicle types or movement behaviors.

---

For more, see the `StrategyPatternDemo.java` file for a runnable example.

