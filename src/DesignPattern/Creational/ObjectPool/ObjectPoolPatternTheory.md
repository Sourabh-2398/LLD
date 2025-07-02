# Object Pool Pattern

## Theory

The Object Pool Pattern is a creational design pattern that manages a set of reusable objects.
Instead of creating and destroying objects on demand, the pattern keeps a pool of initialized objects ready to use.
When a client needs an object, it borrows one from the pool. When done, the object is returned to the pool for future reuse. 
This pattern is especially useful for managing expensive-to-create resources, such as database connections, threads, or network sockets.

### Structure
- **ObjectPool**: Manages the pool of reusable objects, handling their allocation and deallocation.
- **Reusable**: The type of object being pooled.
- **Client**: Requests and returns objects from/to the pool.

### Benefits
- Reduces the overhead of creating and destroying objects repeatedly.
- Improves performance for resource-intensive objects.
- Provides centralized management of pooled resources.

### When to Use
- When object creation is expensive and you need to manage a fixed number of objects.
- When you want to limit the number of instances in use at any time.
- When objects can be safely reused after being released by a client.

---

The Object Pool Pattern is commonly used in connection pooling, thread pooling, and resource management in high-performance applications.

