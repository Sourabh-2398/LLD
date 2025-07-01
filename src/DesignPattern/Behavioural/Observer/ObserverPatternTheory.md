# Observer Pattern Theory

The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object (the subject/observable) changes its state, all its dependents (observers) are notified and updated automatically.

## Key Concepts
- **Observable (Subject):** The object being observed. It maintains a list of observers and notifies them of state changes.
- **Observer:** The object that wants to be notified of changes in the observable.

## Use Cases
- Event handling systems
- Implementing distributed event-based systems
- GUI frameworks (e.g., listeners for button clicks)
- Notification services (e.g., stock updates, news feeds)

## Advantages
- Loose coupling between subject and observers
- Easy to add new observers without modifying the subject

## Disadvantages
- Can lead to memory leaks if observers are not removed properly
- Unexpected updates if not managed carefully

## Example
A common example is a notification system for an e-commerce website, where users can subscribe to be notified when an out-of-stock item is restocked. The item acts as the observable, and the users act as observers.

