# Singleton Design Pattern

## Introduction
The Singleton Design Pattern ensures that a class has only one instance and provides a global point of access to it. It is one of the simplest creational design patterns.

## Use Cases
- Logger classes
- Configuration settings
- Database connections
- Caches

## Implementations

### 1. Eager Initialization
Instance is created at class loading time.

### 2. Lazy Initialization
Instance is created only when requested for the first time.

### 3. Thread-Safe Singleton
- Synchronized method
- Double-checked locking
- Bill Pugh Singleton (using static inner class)

## Breaking Singleton
Singleton can be broken by:
- Reflection
- Serialization/Deserialization
- Cloning
- Multithreading (in lazy implementation)

## Preventing Breaking
- Throw exception in constructor if instance exists (reflection)
- Implement readResolve() (serialization)
- Override clone() to prevent cloning
- Use thread-safe implementations

## Code Examples
- Each implementation and breaking scenario is provided in the corresponding Java files.

## Best Practices
- Prefer Bill Pugh implementation for lazy, thread-safe Singleton
- Avoid using Singleton for global state unless necessary
- Ensure breaking scenarios are handled

---

See the Java files in this directory for detailed code and usage examples.

